<div class="row">
	<div class="col-xs-8 col-md-offset-4 col-md-4">
		<h1>SpotLightProducts.com</h1>
	</div>
</div>

<body>

	<div class="row">
		<div class="col-xs-8 col-md-offset-4 col-md-4">
			<div role="alert" class="alert alert-danger" ng-class="{hideElement: !isAlert, showElement: isAlert}">
  				<button type="button" class="close" aria-label="Close" ng-click="hideAlert()"><span aria-hidden="true">&times;</span></button>
  				{{alertMessage}}
			</div>
			<div class="panel panel-default">


				<div class="row">
					<div class="col-xs-8 col-md-offset-1 col-md-10">


						<form name="registerForm" class="css-form" novalidate>
							<h3>Create Account</h3>
							<div class="form-group" ng-class="{ 'has-error' : registerForm.firstName.$invalid && !registerForm.firstName.$pristine }">
								<label for="firstName" class="control-label">First Name</label>
								<input name="firstName" type="text" class="form-control" id="firstName" placeholder="First Name" ng-model="registerUser.firstName" required>
								<p ng-show="registerForm.firstName.$invalid && !registerForm.firstName.$pristine" class="help-block">Your First Name is required.</p>
							</div>

							<div class="form-group" ng-class="{ 'has-error' : registerForm.lastName.$invalid && !registerForm.lastName.$pristine }">
								<label for="lastName" class="control-label">Last Name</label>
								<input name="lastName" type="text" class="form-control" id="lastName" placeholder="Last Name" ng-model="registerUser.lastName" required>
								<p ng-show="registerForm.lastName.$invalid && !registerForm.lastName.$pristine" class="help-block">Your Last Name is required.</p>
							</div>

							<div class="form-group" ng-class="{ 'has-error' : registerForm.email.$invalid && !registerForm.email.$pristine }">
								<label for="exampleInputEmail1" class="control-label">Email Address</label>
								<input name="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" ng-model="registerUser.email" required>
								<p ng-show="registerForm.email.$invalid && !registerForm.email.$pristine" class="help-block">Enter a valid email.</p>
							</div>

							<div class="form-group" ng-class="{ 'has-error' : registerForm.password.$invalid && !registerForm.password.$pristine }">
								<label for="exampleInputPassword1" class="control-label">Password</label>
								<input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" ng-model="registerUser.password" required>
								<p ng-show="registerForm.password.$invalid && !registerForm.password.$pristine" class="help-block">Your password is required.</p>
							</div>

							<div class="form-group" ng-class="{ 'has-error' : registerUser.password !== registerUser.RetypePassword && !registerForm.retypePassword.$pristine }">
								<label for="retypePassword" class="control-label">Retype Password</label>								
								<input name="retypePassword" type="password" class="form-control retype-password" id="retypePassword" placeholder="Retype Password" ng-model="registerUser.RetypePassword">
								<p ng-show="registerUser.password !== registerUser.RetypePassword && !registerForm.retypePassword.$pristine" class="help-block">Does not match with Password.</p>
							</div>
							
							<div class="form-group">
							<label class="radio-inline">
							<input type="radio"
								name="buyerOption" id="buyerOption" value="buyer" ng-model="registerUser.userType">
								Buyer
							</label>
							<label class="radio-inline">
							<input type="radio"
								name="selle	rOption" id="sellerOption" value="seller" ng-model="registerUser.userType">
								Seller
							</label>
							<p ng-show="!registerUser.userType" class="help-block" ng-class="{ 'invalid-input': !registerUser.userType }">Please select a user type.</p>
							</div>
							<br> <br>

							<div class="form-group">
								<button type="register" class="btn btn-primary" ng-disabled="registerForm.$invalid || !registerUser.userType || registerUser.password !== registerUser.RetypePassword" ng-click="saveUserDetails()">Register</button>
							</div>
						</form>

						<br> <br>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>	
