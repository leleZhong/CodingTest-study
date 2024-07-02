/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4153                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4153                           #+#        #+#      #+#    */
/*   Solved: 2024/07/02 20:41:23 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
while (true)
{
    int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
    if (input[0] == 0 && input[1] == 0 && input[2] == 0)
        break;
    
    int a = input[0] * input[0];
    int b = input[1] * input[1];
    int c = input[2] * input[2];

    if ((a + b) == c || (a + c) == b || (b + c) == a)
        Console.WriteLine("right");
    else
        Console.WriteLine("wrong");
}