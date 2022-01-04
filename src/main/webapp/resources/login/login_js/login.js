$(document).ready(function(){
		
	//login.jsp에서 로그인 버튼
	$("#btn_login").on("click",function(){
		id=$("#userId").val();
		pwd=$("#userPw").val();
		var regExp = /[0-9a-zA-Z][_0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\.[_0-9a-zA-Z-]+){1,2}$/;
		
		if(id==""){
			alert("아이디를 입력해주세요");
			$("#userId").focus();
		}
		else if(pwd==""){
			alert("비밀번호를 입력해 주세요")
			$("#userPw").focus();
		}
		else if(!id.match(regExp)){
			alert("아이디를 정확하게 입력하시오 ");
			$("$userId").focus();	
		}else{
			$.ajax({
				type:'POST',
				url:'login/reallogin.do',
				data:{"userId":id,"userPw":pwd},
				dataType:"json",
				success:function(data){
					
					if(data.datas.length>=1){
						location.href="../main";
					}
					
					if(data.datas.length<1){
						alert("아이디 및 비밀번호를 확인해주세요")
					}
				},error :function(){
					alert("에러입니다");
				}
			})
			
		}
	});
	//회원가입 창으로 이동
	$("#btn_create").on("click",function(){
		location.href="../include/member_write";
	});
	//취소 버튼
	$("#btn_cancel").on("click",function(){
		history.back();
	})
	
});