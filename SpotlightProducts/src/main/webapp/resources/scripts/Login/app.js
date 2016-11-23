var loginApp = angular.module("LoginApp", ['ngRoute'])
.config(['$routeProvider',
function($routeProvider){
	$routeProvider
	.when('/', {
        templateUrl: '/LoginPage.do',
        controller: "loginCtrl"
      })
      .when('/RegisterUser', {
        templateUrl: '/NewUserRegister.do',
        controller: "newUserRegisterCtrl"
      })
      .when('/ForgotPassword', {
        templateUrl: '/ForgotPassword.do',
        controller: "forgotPasswordCtrl"
      })
      .otherwise({redirectTo: '/'});
}]);
loginApp.controller("loginCtrl", function($scope, $location, $http){
	$scope.isInvalidCredentials = false;
	
	$scope.showAlert = function(){
		$scope.isInvalidCredentials = true;
	}
	
	$scope.hideAlert = function(){
		$scope.isInvalidCredentials = false;
	}
	
	$scope.registerUser = function(){
		$location.path('/RegisterUser');
	};
	
	$scope.signIn = function(){
		$scope.hideAlert();
		url = $location.absUrl().replace(window.location.pathname + window.location.hash,'/AuthenticateUser');
		data = $scope.user;
		$http.post(url, data)
					.success(function(data, status, headers, config){
						if(data.status == "Success"){
							console.log(data);
						}
						else{
							$scope.alertMessage = "Invalid Credentials. Please try again.";
							$scope.showAlert();
						}
					})
					.error(function(data, status, headers, config){
						$scope.alertMessage = "Technical Error. Please contact the customer service.";
						$scope.showAlert();
					})
	}
});
loginApp.controller("newUserRegisterCtrl", function($scope, $location, $http){
	$scope.isAlert = false;
	$scope.showAlert = function(){
		$scope.isAlert = true;
	}
	
	$scope.hideAlert = function(){
		$scope.isAlert = false;
	}
	$scope.saveUserDetails = function(){
		$scope.hideAlert();
		url = $location.absUrl().replace(window.location.pathname + window.location.hash, '/PostUserDetails');
		data = $scope.registerUser;
		$http.post(url, data)
					.success(function(data, status, headers, config){
						if(data.status == "Success"){
							console.log(data);
						}
						else{
							$scope.alertMessage = data.message;
							$scope.showAlert();
						}
					})
					.error(function(data, status, headers, config){
						$scope.alertMessage = "Technical Error. Please contact the customer service.";
						$scope.showAlert();
					})
	}
})
loginApp.controller("forgotPasswordCtrl", function($scope){

})