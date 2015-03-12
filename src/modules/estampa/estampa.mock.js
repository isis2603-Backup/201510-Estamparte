/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function () {
    var estampaModule = angular.module('estampaModule');

    estampaModule.run(['$httpBackend', 'estampa.context', 'MockModule.mockRecords', function ($httpBackend, context, mockRecords) {
            $httpBackend.whenGET('webresources/' + context + '/estampasDe').respond(function () {
                var id=1;
                var collection = mockRecords[context];
                var respuesta = [];
                for (var i in collection) {
                    if(collection[i].idAutor===id){
                        respuesta.push(collection[i]);
                    }
                }
                if(respuesta.length!==0){
                    return [200, respuesta, {}];
                }else{
                    return [404, {}, {}];
                }
            });

        }]);
})();

