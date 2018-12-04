require(["jquery", "vue"], function ($, vue){
	$(function(){
        alert("load finished");
    })
     var app = new vue({
	        el: '#hello',
	        data: {
	            message: 'Hello Vue!'
	        }
	    })
});