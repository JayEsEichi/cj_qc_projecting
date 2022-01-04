//추후에 각 카테고리 별 jsp에 일일히 작성한 모델별 버튼 코드를 지우고 ajax로 버튼을 불러오는 형식으로 간소화 코딩 시킬 것 
function cj_wrong_data_search(sku_title){
	
	$("#wrong_data_list_view").empty();
	
	var sku_name = sku_title;
	var sku;
	
	if(sku_name != null){
		sku = sku_name;
	}
	
	var str = "";
	var model_name = "";
	
	// get으로 데이터 값을 넘겨 받으려면 url에 ? 와 지정한 파라미터 값 + 데이터 변수를 입력한다.
	// 파라미터를 지정해서 넘기면 해당되는 컨트롤러에 @RequestParam이 동일한 파라미터가 있으면 컨트롤러로 값을 보낸다.
	$.ajax({
		type:"get",
		url:"cj_wrong_data_search?sku_title=" + sku,
		dataType:"json",
		success:function(data){
			
			str += "<table>"
			
			str += "<th>카테고리</th>";
			str += "<th>모델명</th>";
			str += "<th>타이틀</th>";
			str += "<th>옵션</th>";
			str += "<th>낱개</th>";
			str += "<th>묶음</th>";
			str += "<th>낱개 가격</th>";
			str += "<th>마켓코드</th>";
			str += "<th>URL</th>";
			

			//기존에 사용하던 $(data.ratio).each(function(~, ~) 는 먹히지 않는 것 같다.
			//이제 $.each(data.ratio, function(~, ~) 로 변경해서 사용하도록 하자
			$.each(data.wrongmappingdata, function(pres, objArr){
				str += "<tr>"
				str += "<td>" + objArr.category + "</td>";
				str += "<td>" + objArr.sku_title + "</td>";
				str += "<td>" + objArr.title_txt + "</td>";
				str += "<td>" + objArr.opt_txt + "</td>";
				str += "<td>" + objArr.unit_count + "</td>";
				str += "<td>" + objArr.group_count + "</td>";
				str += "<td>" + objArr.unit_price + "</td>";
				str += "<td>" + objArr.market_pid + "</td>";
				str += "<td><a href='" + objArr.addr + "'>[LINK]</a></td>";
				str += "</tr>"
				
				model_name = "<p>" + objArr.sku_title + "</p>";
					
				console.log(model_name);
			});
				
				str += "</table>";
				
				alert(model_name);
				
				
				$("#wrong_data_list_view").html(str);

			
		},
		
		error:function(){
			$("#wrong_data_list_view").text("에러어어어어얼너ㅏ율미ㅏㅇ휴ㅣ뮪");
		}
	});
	
};

