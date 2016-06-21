var app = angular.module('myApp', []);

app.controller('customersCtrl',function($scope, $http) {
	$scope.course = {
		date : ''
	};
	$('#check-out').datepicker({autoclose: true});
	$('#check-out').datepicker().on(
		'changeDate',
		function(ev) {
			$scope.course.date = $('#check-out').val();
			$scope.$digest();
			$scope.$watch('course.date', function(newValue,
				oldValue) {
				$scope.course.date = newValue;
			});
		});
	$http(
	{
		method : 'GET',
		url : 'http://localhost:8080/QLDatLichKham/DichVuRest?command=getAllDichVu',
		headers : {
			'Content-type' : 'application/json'
		}
	}).success(function(response) {
		$scope.models = response;
	}).error(function(error) {
		$scope.error = error;
	});

	$scope.data = {
		buoiKham : null,
		multipleSelect : [],
		option1 : '1',
	};

	$scope.maDichVu = {
		dichVu : null,
		multipleSelect : [],
		option1 : '1',
	};

	$scope.loadPhongKham = function() {
		$scope.thoiGianBatDau=null;
		$scope.thoiGianKetThuc=null;

		$http(
		{
			method : 'GET',
			url : "http://localhost:8080/QLDatLichKham/PhongKhamRest?command=findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham&dichVuId="
			+ $scope.maDichVu.dichVu
			+ "&ngayKham="
			+ $scope.course.date
			+ "&buoiKham="
			+ $scope.data.buoiKham + "",
			headers : {
				'Content-type' : 'application/json'
			}
		}).success(function(response) {
			$scope.PhongKhams = response;
		}).error(function(error) {
			$scope.error = error;
		});

		$http(
		{
			method : 'GET',
			url : "http://localhost:8080/QLDatLichKham/BacSiRest?command=findBacSiByDichVuIdAndNgayKhamAndBuoiKham&dichVuId="
			+ $scope.maDichVu.dichVu
			+ "&ngayKham="
			+ $scope.course.date
			+ "&buoiKham="
			+ $scope.data.buoiKham + "",
			headers : {
				'Content-type' : 'application/json'
			}
		}).success(function(response) {
			$scope.BacSis = response;
		}).error(function(error) {
			$scope.error = error;
		});
		$scope.bacSiId = null;
		$scope.phongKhamId = null;
	}

	$scope.loadBacSiByPhongKham = function() {
		$http(
		{
			method : 'GET',
			url : "http://localhost:8080/QLDatLichKham/BacSiRest?command=findBacSiByLichBieu&ngayKham="
			+ $scope.course.date
			+ "&buoiKham="
			+ $scope.data.buoiKham
			+ "&phongKhamId="
			+ $scope.phongKhamId + "",
			headers : {
				'Content-type' : 'application/json'
			}
		}).success(function(response) {
			$scope.bacSiId = response[0].bacSi_Id;
		}).error(function(error) {
			$scope.error = error;
		});		
		
		$http(
				{
					method : 'GET',
					url : "http://localhost:8080/QLDatLichKham/CaKhamRest?command=findCaKhamByLichBieu&ngayKham="
					+ $scope.course.date
					+ "&buoiKham="
					+ $scope.data.buoiKham
					+ "&phongKhamId="
					+ $scope.phongKhamId + "",
					headers : {
						'Content-type' : 'application/json'
					}
				}).success(function(response) {
					$scope.thoiGianBatDau = Date.parse(response[0].thoiGianBatDau);
					$scope.thoiGianKetThuc = Date.parse(response[0].thoiGianKetThuc);
				}).error(function(error) {
					$scope.error = error;
				});	
	}

	$scope.loadPhongKhamByBacSi = function() {
		$http(
		{
			method : 'GET',
			url : "http://localhost:8080/QLDatLichKham/PhongKhamRest?command=findPhongKhamByLichBieu&ngayKham="
			+ $scope.course.date
			+ "&buoiKham="
			+ $scope.data.buoiKham
			+ "&bacSiId="
			+ $scope.bacSiId + "",
			headers : {
				'Content-type' : 'application/json'
			}
		}).success(function(response) {
			$scope.phongKhamId = response[0].phongKham_Id;
		}).error(function(error) {
			$scope.error = error;
		});

		$http(
		{
			method : 'GET',
			url : "http://localhost:8080/QLDatLichKham/CaLamRest/findCaLamByLichBieu/"
			+ $scope.course.date
			+ "/"
			+ $scope.data.buoiKham
			+ "/"
			+ $scope.phongKhamId + "",
			headers : {
				'Content-type' : 'application/json'
			}
		}).success(function(response) {
			$scope.caLam = response.ca;
		}).error(function(error) {
			$scope.error = error;
		});
	}
});