<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class="container-fulid">
	<div>
		<h1>키오스크응</h1>
		
	</div>
	<div class="row">
  <div class="col-3">
    <div class="list-group" id="list-tab" role="tablist">
      <a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="home">매출</a>
      <a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">상품 등록</a>
      <a class="list-group-item list-group-item-action" id="list-messages-list" data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">상품 목록</a>
      <a class="list-group-item list-group-item-action" id="list-settings-list" data-toggle="list" href="#list-settings" role="tab" aria-controls="settings">문의</a>
    </div>
  </div>
  
  
  <div class="col-9">
    <div class="tab-content" id="nav-tabContent">
      <div class="tab-pane fade show active" id="list-home" role="tabpanel" aria-labelledby="list-home-list">
	
			매출
	
		</div>
      <div class="tab-pane fade" id="list-profile" role="tabpanel" aria-labelledby="list-profile-list">
      		상품 등록
      		<form method="post" action="productRegister" enctype="multipart/form-data">
      			<select name="product_type">
      				<option>라떼</option>
      				<option>에스프레소</option>
      				<option>과일</option>
      				<option>디저트</option>
      			</select>
      			
      			<input class="" type="text" id="name" name="product_name" placeholder="상품 이름">
      			<input class="" type="text" id="price" name="product_price" placeholder="상품 가격">
      			<input type="file" name="file">
      			
      			<input type="submit">
      		</form>
      </div>
      <div class="tab-pane fade" id="list-messages" role="tabpanel" aria-labelledby="list-messages-list">
				상품 목록
				
				<table>
					<tr>
						<th>상품 이름</th>
						<th>상품 가격</th>
						<th>상품 타입</th>
						<th>상품 이미지</th>
					</tr>
					<c:forEach items="${plist}" var="pvo">
					<tr>
						<td>${pvo.product_name }</td>
						<td>${pvo.product_price }</td>
						<td>${pvo.product_type }</td>
						<td>
						<img src="<%=request.getContextPath() %>/imgUpload/${pvo.product_image }">
						</td>
					</tr>
					</c:forEach>
				</table>
		</div>
      <div class="tab-pane fade" id="list-settings" role="tabpanel" aria-labelledby="list-settings-list">...</div>
    </div>
  </div>
</div>

</div>

                                                                                    
<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>