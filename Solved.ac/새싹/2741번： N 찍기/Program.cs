/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2741                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2741                           #+#        #+#      #+#    */
/*   Solved: 2024/06/27 17:50:56 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

int n = int.Parse(Console.ReadLine().Trim());
StringBuilder sb = new StringBuilder();

for (int i = 1; i <= n; i++)
{
    sb.AppendLine(i.ToString());
}
Console.WriteLine(sb.ToString());