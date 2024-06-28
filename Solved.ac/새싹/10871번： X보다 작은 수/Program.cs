/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10871                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10871                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 14:35:50 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

int[] input1 = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
int[] input2 = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
StringBuilder sb = new StringBuilder();

for (int i = 0; i < input2.Length; i++)
{
    if (input1[1] > input2[i])
        sb.Append($"{input2[i]} ");
}
Console.WriteLine(sb);