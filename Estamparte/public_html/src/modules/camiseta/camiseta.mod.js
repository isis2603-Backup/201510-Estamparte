/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function () {
    var moduloCamiseta = angular.module('moduloCamiseta', ['CrudModule', 'MockModule','carritoModule']);

    moduloCamiseta.constant('camiseta.context', 'camisetas');

    moduloCamiseta.config(['camiseta.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();

