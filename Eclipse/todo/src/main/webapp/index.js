var app = angular.module("myApp", []);
app.controller("myController", function($scope) {
  $scope.tasks = [];
  // $scope.saved = localStorage.getItem("tasks");
  // $scope.tasks =
  //   localStorage.getItem("tasks") !== null
  //     ? JSON.parse($scope.saved)
  //     : [
  //         { task_name: "Learn AngularJS", status: false },
  //         { task_name: "Build an Angular app", status: false }
  //       ];
  // localStorage.setItem("tasks", JSON.stringify($scope.tasks));
  $scope.saveTask = function() {
    $scope.tasks.push({ task_name: $scope.yourTask, status: false });
    //   localStorage.setItem("tasks", JSON.stringify($scope.tasks));
  };
  $scope.getTask = function() {
    $scope.tasks = [
      { task_name: "6:30 wakeup", status: false },
      { task_name: "have a breakfast", status: false },
      { task_name: "take a shower", status: false },
      { task_name: "commute", status: false },
      { task_name: "JAVA learn", status: false },
      { task_name: "have a lunch", status: false }
    ];
  
    // angular.forEach를 사용하여 배열의 각 항목에 대해 함수 실행
    angular.forEach($scope.tasks, function(task) {
      console.log(task.task_name);
    });
  
    // 배열에 새로운 항목 추가 후 angular.forEach를 사용하여 각 항목 출력
    $scope.saveTask = function() {
      var newTask = { task_name: $scope.yourTask, status: false };
      $scope.tasks.push(newTask);
  
      // 배열의 각 항목에 대해 함수 실행
      angular.forEach($scope.tasks, function(task) {
        console.log(task.task_name);
      });
    };
  };
  $scope.delete = function(i) {
    $scope.tasks.splice(i, 1);
  };
  $scope.finished = function(i) {
    $scope.tasks[i].status = true;
  };
});