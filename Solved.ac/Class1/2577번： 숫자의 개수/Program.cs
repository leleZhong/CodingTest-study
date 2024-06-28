/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2577                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2577                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 18:18:26 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

StringBuilder sb = new StringBuilder();
int a = int.Parse(Console.ReadLine());
int b = int.Parse(Console.ReadLine());
int c = int.Parse(Console.ReadLine());

char[] output = (a * b * c).ToString().ToCharArray();
for (int i = 0; i < 10; i++)
{
    int count = 0;
    for (int j = 0; j < output.Length; j++)
    {
        if (i == (output[j] - '0'))
            count++;
    }
    sb.Append(count);
    sb.AppendLine();
}
Console.WriteLine(sb);