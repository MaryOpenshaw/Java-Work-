(function() {

    var MovieService =  function(cinemaDal) {

        this.getMovies = function()
        {
            return cinemaDal.getMovies;
        };
    };

    angular.module('cinema').service('MovieService', ['cinemaDal', MovieService]);
}());