var app = angular.module('myApp', []);
app.directive("datepicker", function () {
  return {
    restrict: "A",
    require: "ngModel",
    link: function (scope, elem, attrs, ngModelCtrl) {
      var updateModel = function (dateText) {
        scope.$apply(function () {
          ngModelCtrl.$setViewValue(dateText);
          if(dateText != null)
          $('#data').text(dateText);
        });
      };
      var options = {
        dateFormat: "dd-mm-yy",
        onSelect: function (dateText) {
          updateModel(dateText);

        }
      };
      elem.datepicker(options);
    }
  }
});
app.controller('customersCtrl', function($scope, $http) {
	$http({
		method: 'GET',
		url: 'http://localhost:8080/DichVuRest',
		headers: {
			'Content-type': 'application/json'
		}
	}).success(function(response){
		$scope.models = response;
	}).error(function(error){
		$scope.error = error;
	});
	$scope.course = {};
	$scope.course.date = $('#data').val();
	$scope.data = {
        buoiKham: null,
        multipleSelect: [],
        option1: '1',
       };

    $scope.maDichVu = {
        dichVu: null,
        multipleSelect: [],
        option1: '1',
       };

	$scope.loadPhongKham = function() {
//	if(($scope.maDichVu.dichVu != null) && ($scope.course.date != null) && ($scope.data.buoiKham != null))
//	{
	$http({
    			method: 'GET',
    			url: "http://localhost:8080/PhongKhamRest/FindPhongKhamByDichVuIdAndNgayKhamAndBuoiKham/"+$scope.maDichVu.dichVu+"/"+$scope.course.date+"/"+$scope.data.buoiKham+"",
    			headers: {
    				'Content-type': 'application/json'
    			}
    		}).success(function(response){
    			$scope.PhongKhams = response;
    		}).error(function(error){
    			$scope.error = error;
    		});

    		$http({
               method: 'GET',
               url: "http://localhost:8080/BacSiRest/findBacSiByDichVuIdAndNgayKhamAndBuoiKham/"+$scope.maDichVu.dichVu+"/"+$scope.course.date+"/"+$scope.data.buoiKham+"",
               headers: {
                'Content-type': 'application/json'
              }
            }).success(function(response){
             $scope.BacSis = response;
            }).error(function(error){
             $scope.error = error;
            });
//	}
//	else return false;
	}
});