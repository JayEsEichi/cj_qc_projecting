
function cj_category(category_name){
	$("#ratioTable").empty();
	
	var category = category_name;
	var category_gate;
	var str = "";
	
	
	if(category != null){
		category_gate = category;
	}
	
	// get으로 데이터 값을 넘겨 받으려면 url에 ? 와 지정한 파라미터 값 + 데이터 변수를 입력한다.
	// 파라미터를 지정해서 넘기면 해당되는 컨트롤러에 @RequestParam이 동일한 파라미터가 있으면 컨트롤러로 값을 보낸다.
	$.ajax({
		type:"get",
		url:"cj_category?category=" + category_gate,
		dataType:"json",
		success:function(data){
			
			str += "<table>"
			
			//기존에 사용하던 $(data.ratio).each(function(~, ~) 는 먹히지 않는 것 같다.
			//이제 $.each(data.ratio, function(~, ~) 로 변경해서 사용하도록 하자
			$.each(data.ratio, function(pres, objArr){
				str += "<tr>"
				str += "<td>" + objArr.category + "</td>";
				str += "<td>" + objArr.unit_count + "</td>";
				str += "<td>" + objArr.group_count + "</td>";
				str += "<td>" + objArr.cnt + "</td>";
				str += "<td>" + objArr.ratio + "%</td>";
				str += "</tr>"
				console.log(str);
			});
			
			str += "</table>";
			
			$("#ratioTable").html(str);

			
		},
		
		error:function(){
			$("#ratioTable").text("에러어어어어얼너ㅏ율미ㅏㅇ휴ㅣ뮪");
		}
	});
	
};


function cj_ratio_graph(category_name){
	$("#canvas").empty();
	
	var category = category_name;
	var category_gate;
	
	var chartLabels = [];
	var chartData = [];

	if(category != null){
		category_gate = category;
	}
	
	$.getJSON("http://localhost:8080/controller/cj_ratio_graph?category=" + category_gate, function(data) {
		$.each(data, function(inx, obj) {
			chartLabels.push(obj.unit_count + " | " + obj.group_count);
			chartData.push(obj.cnt);
		});
		
		createChart();
		console.log("create Chart")

	});

	var lineChartData = {
		labels : chartLabels,
			datasets : [

			{

				label : category + " 조합 비율",
				fillColor : "rbga(151,187,205,0.2)",
				strokeColor : "rbga(151,187,205,1)",
				pointColor : "rbga(151,187,205,1)",
				pointStrokeColor : "#fff",
				pointHighlightFill : "#fff",
				pointHighlightStroke : "rbga(151,187,205,1)",
				data : chartData
			}
			]
		}

	function createChart() {
			var ctx = document.getElementById("canvas").getContext("2d");
			LineChartDemo = Chart.Line(ctx, {
				data : lineChartData,
				options : {
					scales : {
						yAxes : [{
							ticks : {
								beginAtZero : true
							}
						}]
					}
				}
			})
		}
	function cj_category(category_name){
		$("#ratioTable").empty();
		
		var category = category_name;
		var category_gate;
		var str = "";
		
		
		if(category != null){
			category_gate = category;
		}
		
		// get으로 데이터 값을 넘겨 받으려면 url에 ? 와 지정한 파라미터 값 + 데이터 변수를 입력한다.
		// 파라미터를 지정해서 넘기면 해당되는 컨트롤러에 @RequestParam이 동일한 파라미터가 있으면 컨트롤러로 값을 보낸다.
		$.ajax({
			type:"get",
			url:"cj_category?category=" + category_gate,
			dataType:"json",
			success:function(data){
				/*
				str += "<table>"
				str += "<th>카테고리</th>";
				str += "<th>낱개</th>";
				str += "<th>묶음</th>";
				str += "<th>조합 수</th>";
				str += "<th>비율</th>";
				*/
				
				//기존에 사용하던 $(data.ratio).each(function(~, ~) 는 먹히지 않는 것 같다.
				//이제 $.each(data.ratio, function(~, ~) 로 변경해서 사용하도록 하자
				$.each(data.ratio, function(pres, objArr){
					str += "<tr>"
					str += "<td>" + objArr.category + "</td>";
					str += "<td>" + objArr.unit_count + "</td>";
					str += "<td>" + objArr.group_count + "</td>";
					str += "<td>" + objArr.cnt + "</td>";
					str += "<td>" + objArr.ratio + "%</td>";
					str += "</tr>"
					console.log(str);
				});
				
				//str += "</table>";
				
				$("#ratioTable").html(str);

				
			},
			
			error:function(){
				$("#ratioTable").text("에러어어어어얼너ㅏ율미ㅏㅇ휴ㅣ뮪");
			}
		});
		
	};
};