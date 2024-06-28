/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15552                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15552                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 08:39:11 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

StringBuilder sb = new StringBuilder();
int t = int.Parse(Console.ReadLine());

for (int i = 0; i < t; i++)
{
    int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
    sb.Append(input[0] + input[1] + "\n");
}
Console.WriteLine(sb);