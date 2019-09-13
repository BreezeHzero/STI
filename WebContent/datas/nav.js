var navs = [{
	"title": "院系信息",
	// "icon": "fa-cubes",
    "icon": "fa-cogs",
	"spread": false,
	"children": [{
        "title": "学院专业管理",
        "icon": "fa-table",
        // "href": "begtable.html"
        "href": "major/majorinfo2.html"
//        "href": "major/addmajor.html"
	}]
}, {
	"title": "班级信息",
	"icon": "fa-cogs",
	"spread": false,
	"children": [{
		"title": "班级管理",
		"icon": "fa-table",
		// "href": "begtable.html"
        "href": "classes/classinfo.html"
	}]
}, {
	"title": "大赛信息管理",
	// "icon": "&#x1002;",
    "icon": "fa-cogs",
	"spread": false,
	// "spread": false,
	"children": [{
		"title": "录入赛事信息",
		"icon": "fa-check-square-o",
		// "href": "icheck.html"
        "href": "competition/addcompetition.html"
	},{
        "title": "赛事信息",
        "icon": "fa-check-square-o",
        // "href": "icheck.html"
        "href": "competition/competitioninfo.html"
    }]
},  {
    "title": "参赛人员信息管理",
    "icon": "fa-cogs",
    "href": "",
    "spread": false,
    "children": [{
        "title": "录入参赛人员信息",
        "icon": "fa-check-square-o",
        "href": "team/addteam.html"
    },{
        "title": "参赛人员信息",
        "icon": "fa-check-square-o",
        "href": "team/teaminfo.html"
    }]
},  {
    "title": "获奖信息管理",
    "icon": "fa-cogs",
    "href": "",
    "spread": false,
    "children": [{
        "title": "录入获奖记录",
        "icon": "fa-check-square-o",
        "href": "record/addrecord.html"
    }, {
        "title": "获奖记录",
        "icon": "fa-check-square-o",
        "href": "record/recordinfo.html"
    }, {
        "title": "参赛获奖信息统计",
        "icon": "fa-navicon",
        "href": "sta/echars.html"
    }]
},/*{
	"title": "赛事信息统计模块",
	"icon": "fa-stop-circle",
    "href": "",
	"spread": false,
    "children": [{
        "title": "比赛信息管理",
        "icon": "fa-navicon",
        "href": "team/teaminfo.html"
    }]
},*/ {
    "title": "用户管理",
    "icon": "fa-address-book",
    "href": "",
    "spread": false,
    "children": [{
        "title": "添加用户",
        // "icon": "fa-github",
        "icon": "fa-cogs",
        // "href": "https://www.github.com/"
        "href": "user/adduser.html"
    }, {
        "title": "管理用户信息",
        // "icon": "fa-qq",
        "icon": "fa-cogs",
        // "href": "http://www.qq.com/"
        "href": "user/userinfo.html"
    }, {
        "title": "个人信息维护",
        // "icon": "&#xe609;",
        "icon": "fa-cogs",
        // "href": "http://fly.layui.com/"
        "href": "user/modifyUserinfo.html"
    }]
},{
    "title": "其他",
    "icon": "fa-address-book",
    "href": "",
    "spread": false,
    "children": [{
        "title": "个人登录日志",
        // "icon": "fa-github",
        "icon": "fa-cogs",
        "href": "loginlog/loginlog.html"
    }]
}];