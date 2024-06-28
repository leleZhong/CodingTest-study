/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 8958                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/8958                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 20:42:11 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

StringBuilder sb = new StringBuilder();
int t = int.Parse(Console.ReadLine());

for (int i = 0; i < t; i++)
{
    string input = Console.ReadLine();
    int count = 0;
    int sum = 0;
    for (int j = 0; j < input.Length; j++)
    {
        if (input[j] == 'O')
        {
            count++;
            sum += count;
        }
        else if (input[j] == 'X')
        {
            count = 0;
        }
    }
    sb.Append(sum + "\n");
}
Console.WriteLine(sb);