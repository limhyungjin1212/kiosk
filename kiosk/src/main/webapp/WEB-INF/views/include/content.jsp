<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<script>
	$(document).ready(function() {

		$("#proBox").click(function() {
			//var pno = $(this).parent().attr("data-rno"); //상품의 번호
			var pno = 1;
			console.log(pno);
			
			 window.open("productDetail?no="+pno+"", "새창", "width=800, height=700, toolbar=no, menubar=no, scrollbars=no, resizable=yes" );  
			 
/*						 toolbar = 상단 도구창 출력 여부 

			 menubar = 상단 메뉴 출력 여부

			 location = 메뉴아이콘 출력 여부

			 directories = 제목 표시줄 출력 여부

			 status = 하단의 상태바 출력 여부

			 scrollbars = 스크롤바 사용 여부

			 resizable = 팝업창의 사이즈 변경 가능 여부

			 fullscreen = 전체화면으로 할지 선택 여부

			 channelmode = F11키 기능이랑 같음

			 출처: https://kcmschool.com/63 [web sprit]
*/								

		});

	});
</script>
<!-- Page Content -->
<div class="container" id="ct">


	<div id="carouselExampleIndicators" class="carousel slide my-4"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active">
				<img class="d-block img-fluid" src="http://placehold.it/900x350"
					alt="First slide">
			</div>
			<div class="carousel-item">
				<img class="d-block img-fluid" src="http://placehold.it/900x350"
					alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block img-fluid" src="http://placehold.it/900x350"
					alt="Third slide">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>


	<div class="row">

		<div class="col-lg-3">

			<h1 class="my-4">종류</h1>
			<div class="list-group">
				<a href="#" class="list-group-item">Category 1</a> <a href="#"
					class="list-group-item">Category 2</a> <a href="#"
					class="list-group-item">Category 3</a>
			</div>

		</div>
		<!-- /.col-lg-3 -->

		<div class="col-lg-9">


			<div class="row">

				<c:forEach items="${plist}" var="pvo">
					<div class="col-lg-4 col-md-6 mb-4" id="proBox">
						<h5>${pvo.product_id }</h5>
						<div class="card h-100">
							<img
								class="card-img-top"
								src="<%=request.getContextPath() %>/imgUpload/${pvo.product_image }"
								alt="">
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">${pvo.product_name }</a>
								</h4>
								<h5>${pvo.product_price }</h5>
								<p class="card-text">서ㅜㄹ명</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733;
									&#9733; &#9734;</small>
							</div>
						</div>
					</div>

				</c:forEach>
				<!-- Button trigger modal -->
				
				<div>
					<h1>장바구니</h1>
				</div>
			</div>
			<!-- /.row -->

		</div>
		<!-- /.col-lg-9 -->

	</div>
	<!-- /.row -->

</div>
<!-- /.container -->