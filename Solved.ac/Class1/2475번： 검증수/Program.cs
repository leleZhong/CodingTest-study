/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2475                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2475                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 16:49:27 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
int sum = 0;

for (int i = 0; i < input.Length; i++)
{
    sum += input[i] * input[i];
}
Console.WriteLine(sum % 10);