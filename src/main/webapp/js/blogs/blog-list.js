require(["jquery", "vue"], function ($, vue){
    var app = new vue({
	    el: '#blogList', 
	    
	    data: {
	    	
        }, 
        
		methods: {
	        plus: function () {
	        	this.a++
	        }, 
	        
	        findBlogsList: function () {
	        	
	        }, 
	        
	        get: function () {
	        	alert("123");
	            this.$http.get('/try/ajax/ajax_info.txt').then(
	    	        function(res){
	    	        	document.write(res.body);
	    	        },function(){
	    	        	console.log('请求失败处理');
	    	        }
	    	    );
	        }, 
        }, 
        
//        el 被新创建的 vm.$el 替换，并挂载到实例上去之后调用该钩子。如果 root 实例挂载了一个文档内元素，当 mounted 被调用时 vm.$el 也在文档内。
//        注意 mounted 不会承诺所有的子组件也都一起被挂载。如果你希望等到整个视图都渲染完毕，可以用 vm.$nextTick 替换掉 mounted：
        mounted: function () {
    	    this.$nextTick(function () {
    	        this.$http.get('/try/ajax/ajax_info.txt').then(
    	        	function(res){
    	        		document.write(res.body);
    	        	},function(){
    	        		console.log('请求失败处理');
    	        	}
    	        );
    	    })
        }
	})
});
