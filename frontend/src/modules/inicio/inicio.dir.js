angular.module('inicioModule')
.directive('inicioDir', function () {
	return {
		controller: 'inicioCtrl',
		replace: true,
		templateUrl: 'src/modules/inicio/inicio.tpl.html'
	};
});