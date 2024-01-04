class Solution {
     fun solution(n: Int) = (2..n).first {n % it == 1}
}

// class Solution {
//     fun solution(n: Int): Int {
//         var answer: Int = 0
        
//         for(i in 2..n - 1){
//             if(n % i == 1){
//                 answer = i
//                 break
//             }
//         }
//         return answer
//     }
// }