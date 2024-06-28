/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10807                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10807                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 14:47:00 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int n = int.Parse(Console.ReadLine());
int[] num = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
int v = int.Parse(Console.ReadLine());
int output = 0;

for (int i = 0; i < num.Length; i++)
{
    if (v == num[i])
        output++;
}
Console.WriteLine(output);