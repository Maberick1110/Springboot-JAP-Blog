let index = {
	init: function() {

		$("#btn-save").on("click", () => {
			this.save();
		});
		
		$("#btn-update").on("click", () => {
			this.update();
		});			
	},

	save: function() {
		//alert('user 의 save 함수 호출됨');
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()

		};
		
		//console.log(data);
		
		$.ajax({
			type: "POST" ,
			url: "/auth/joinProc" ,
			data: JSON.stringify(data),
			contentType:"application/json; charset=utf-8" , 
			dataType: "json"
		}).done(function(resp){
			alert("회원가입이 완료 되었습니다.");
			//console.log(resp);
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	},
	
		update: function() {
		//alert('user 의 save 함수 호출됨');
		let data = {
			id: $("#id").val(),
			password: $("#password").val(),
			username: $("#username").val(),
			email: $("#email").val()
		};
		//console.log(data);
		
		$.ajax({
			type: "PUT" ,
			url: "/user" ,
			data: JSON.stringify(data),
			contentType:"application/json; charset=utf-8" , 
			dataType: "json"
		}).done(function(resp){
			alert("회원 수정이 완료 되었습니다.");
			//console.log(resp);
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	},
	
	}

index.init();