new Vue({
    el: '#app',
    data() {
        return {
            queryParams: {
                table: "t_cbsglxx",
                id: "",
                tyscxydm: "",
                userName: "chenqi",
                password: "123456"
            },
            tableHeight: 0,
            dataList: [],
            pageIndex: 1,
            pageSize: 10,
            totalPage: 0,
            dataListLoading: false,
            tableHeadList: [],
            dataRule: {
                table: [
                    {required: true, message: "表名不能为空!", trigger: "blur"},
                ],
                userName: [
                    {required: true, message: "用户名不能为空!", trigger: "blur"},
                ],
                password: [
                    {required: true, message: "密码不能为空", trigger: "blur"},
                ],
            },
        };
    },
    mounted: function () {
        const _this = this;
        _this.$nextTick(function () {
            _this.tableHeight = _this.$el.offsetHeight - 200
        })
    },
    methods: {
        // 查询数据
        getDataList() {
            const _this = this;
            const auth = btoa(decodeURI((_this.queryParams.userName.trim() + ":" + _this.queryParams.password)))
            const params = new URLSearchParams();
            params.append('current', _this.pageIndex);
            params.append('size', _this.pageSize);
            params.append('id', _this.queryParams.id);
            params.append('tyshxydm', _this.queryParams.tyscxydm);
            this.$refs["queryParams"].validate((valid) => {
                if (valid) {
                    _this.dataList = [];
                    _this.dataListLoading = true;
                    Promise.all([
                        fetch('/api/wwyt/' + _this.queryParams.table + '/heads', {
                            method: 'GET',
                            headers: {
                                Authorization: "Basic " + auth,
                            }
                        }),
                        fetch('/api/wwyt/' + _this.queryParams.table + '/page?' + params.toString(), {
                            method: 'GET',
                            headers: {
                                Authorization: "Basic " + auth,
                            },
                        })
                    ])
                        .then(([response1, response2]) => Promise.all([response1.json(), response2.json()]))
                        .then(([data1, data2]) => {
                            if (data1.code === 200 && data2.code === 200) {
                                this.tableHeadList = data1.data;
                                this.dataList = data2.data.records;
                                this.totalPage = data2.data.total;
                            } else {
                                this.$message.error(data2.msg);
                            }
                            _this.dataListLoading = false;
                        })
                        .catch((error) => {
                            _this.dataListLoading = false;
                            this.$message.error(error);
                        });
                }
            });
        },
        // 每页数
        sizeChangeHandle(val) {
            this.pageSize = val;
            this.pageIndex = 1;
            this.getDataList();
        },
        // 当前页
        currentChangeHandle(val) {
            this.pageIndex = val;
            this.getDataList();
        },
        //导出
        handleExport() {
            const _this = this;
            const auth = btoa(decodeURI((_this.queryParams.userName.trim() + ":" + _this.queryParams.password)))
            const params = new URLSearchParams();
            params.append('current', _this.pageIndex);
            params.append('size', _this.pageSize);
            params.append('id', _this.queryParams.id);
            params.append('tyshxydm', _this.queryParams.tyscxydm);
            this.$confirm('是否确认导出所有数据?', '警告', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning'
            }).then(function () {
                fetch('/api/wwyt/' + _this.queryParams.table + '?' + params.toString(), {
                    method: 'GET',
                    headers: {
                        Authorization: "Basic " + auth,
                    },
                    responseType: 'arraybuffer',
                }).then(r => {
                    const contentType = r.headers.get('Content-Type');
                    if (!r.ok) {
                        // 当出现异常时，从后端获取错误提示并展示
                        return r.text()
                            .then(textData => {
                                const res = JSON.parse(textData)
                                _this.$message.error(res.msg);
                            });
                    }
                    // 从响应头中获取文件名和文件类型
                    const filename = decodeURIComponent(r.headers.get('Content-Disposition').split("filename*=utf-8''")[1]);
                    return r.arrayBuffer()
                        .then(arrayBufferData => {
                            return {
                                filename,
                                contentType,
                                data: new Blob([arrayBufferData], {type: contentType})
                            };
                        });
                }).then(({filename, contentType, data}) => {
                    // 创建虚拟的 URL
                    const url = URL.createObjectURL(data);

                    // 创建链接并模拟点击下载
                    const link = document.createElement('a');
                    link.href = url;
                    link.download = filename;
                    link.click();

                    // 释放虚拟 URL
                    URL.revokeObjectURL(url);
                })
            }).catch(error => {
                // 处理错误
                _this.$message.error(error);
            })
        },
        handleQuery() {
            this.pageIndex = 1
            this.getDataList()
        },
        resetQuery() {
            this.queryParams.table = "";
            this.queryParams.id = "";
        }
    }
});
