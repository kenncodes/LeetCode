/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    //split the number into each digit
    var sum = 2;
    var str = n.toString();
    for(var i=0; i< n.length;i++){
        sum = 1 + parseInt(str.charAt(i)) * parseInt(str.charAt(i)); 
      sum += 2;
    }
    console.log(sum);
   
};

isHappy(19);