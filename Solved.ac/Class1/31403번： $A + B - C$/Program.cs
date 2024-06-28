/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 31403                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/31403                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 17:16:34 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

StringBuilder sb = new StringBuilder();
string a = Console.ReadLine();
string b = Console.ReadLine();
int c = int.Parse(Console.ReadLine());

sb.Append(int.Parse(a) + int.Parse(b) - c);
sb.AppendLine();
sb.Append(int.Parse(a + b) - c);
Console.WriteLine(sb);