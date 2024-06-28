/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2439                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2439                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 16:55:10 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

int n = int.Parse(Console.ReadLine());
StringBuilder sb = new StringBuilder();

for (int i = 0; i < n; i++)
{
    for (int j = 0; j < n - (i + 1); j++)
        sb.Append(" ");
    for (int j = 0; j < i + 1; j++)
        sb.Append("*");
    sb.AppendLine();
}
Console.WriteLine(sb);