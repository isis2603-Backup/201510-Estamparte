/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function () {
    var app = angular.module('moduloCamiseta');

    app.controller('camisetaCtrl', ['$scope', 'CRUDUtils', 'camiseta.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();

            this.contiene = function (id)
            {
                for (var i = 0; i < $scope.estampasUsadas.length; i++)
                {
                    if ($scope.estampasUsadas[i] === id)
                        return true;
                }
                return false;
            };
            this.agregarEstampa = function (id)
            {
                $scope.estampasUsadas.push(id);
            };
            this.eliminarEstampa = function (id)
            {

                for (var i = 0; i < $scope.estampasUsadas.length; i++)
                {
                    if ($scope.estampasUsadas[i] === id)
                    {
                        $scope.estampasUsadas.splice(i, 1);
                        break;
                    }
                }
            }

        }]);
})();

