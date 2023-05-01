/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
    let max = salary[0]
    let min = salary[0]
    let sum=salary[0]
    for ( let i=1 ; i<salary.length;i++){
        sum = sum + salary[i]
        if (salary[i]>max){
            max=salary[i]
        }
        else if (salary[i]<min){
            min=salary[i]
        }

    }
    sum = sum-max-min
    let average = sum / (salary.length -2)
    return average  
};