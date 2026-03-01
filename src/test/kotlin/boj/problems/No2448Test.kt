package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2448Test : StringSpec({
    "별 찍기 - 11 : https://www.acmicpc.net/problem/2448" {
        val given = "24"
        val expected = """
                       *                       
                      * *                      
                     *****                     
                    *     *                    
                   * *   * *                   
                  ***** *****                  
                 *           *                 
                * *         * *                
               *****       *****               
              *     *     *     *              
             * *   * *   * *   * *             
            ***** ***** ***** *****            
           *                       *           
          * *                     * *          
         *****                   *****         
        *     *                 *     *        
       * *   * *               * *   * *       
      ***** *****             ***** *****      
     *           *           *           *     
    * *         * *         * *         * *    
   *****       *****       *****       *****   
  *     *     *     *     *     *     *     *  
 * *   * *   * *   * *   * *   * *   * *   * * 
***** ***** ***** ***** ***** ***** ***** *****
        """.trimIndent()

        No2448().solve(given.reader().buffered()) shouldBe expected
    }
})
