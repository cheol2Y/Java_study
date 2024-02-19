
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% int i = 0; %>
<!DOCTYPE html>
<html>
<head>
  <!-- 문자 인코딩 및 viewport 설정 -->
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- 문서 제목 -->
  <title>TodoList ver1</title>
  
  <!-- AngularJS 및 Bootstrap CSS 라이브러리 추가 -->
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
  <link rel="stylesheet" href="index.css"/>
</head>
<body>
  <!-- AngularJS 앱 및 컨트롤러 설정 -->
  <div class="app-container d-flex align-items-center justify-content-center flex-column" ng-app="myApp" ng-controller="myController">
    
    <!-- 텍스트 바인딩 -->
    {{ task_name }}
    
    <!-- Todo App 제목 -->
    <h3>Todo App</h3>
    
    <!-- 할 일 입력 폼 -->
    <div class="d-flex align-items-center mb-3">
      <div class="form-group mr-3 mb-0">
        <input ng-model="yourTask" type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter a task here" />
      </div>
      
      <!-- 할 일 저장 및 불러오기 버튼 -->
      <button type="button" class="btn btn-primary mr-3" ng-click="saveTask()">Save</button>
      <button type="button" class="btn btn-info" ng-click="getTask()">Get Tasks</button>
    </div>
    
    <!-- 더미 데이터 표시 -->
    {{ yourName }}
    
    <!-- 할 일 목록 테이블 -->
    <div class="table-wrapper">
      <table class="table table-hover table-bordered">
        <thead>
          <tr>
            <th>No.</th>
            <th>Todo item</th>
            <th>status</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody style="background-color: lightblue;">
          <!-- 할 일 목록 반복문 -->
          <tr ng-repeat="task in tasks" class="{{ task.status ? 'table-success' : 'table-light' }}">

            <td>{{ $index + 1 }} <% i+=1; %></td>
            <td class="{{ task.status ? 'complete' : 'task' }}" style="background-color: lightblue;">{{ task.task_name }}</td>
            <td>{{ task.status ? "Completed" : "In progress" }}</td>
            <td>
              <!-- 삭제 및 완료 버튼 -->
              <button class="btn btn-danger" ng-click="delete($index)">Delete</button>
              <button class="btn btn-success" ng-click="finished($index)">Finished</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  
  <!-- 스크립트 파일 추가 -->
  <script src="index.js"></script>
  
  <!-- jQuery 및 Bootstrap JS 라이브러리 추가 -->
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>