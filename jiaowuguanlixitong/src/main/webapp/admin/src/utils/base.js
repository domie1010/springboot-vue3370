const base = {
    get() {
        return {
            url : "http://localhost:8080/jiaowuguanlixitong/",
            name: "jiaowuguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jiaowuguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教务管理系统"
        } 
    }
}
export default base
