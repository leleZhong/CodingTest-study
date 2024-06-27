/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11382                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11382                          #+#        #+#      #+#    */
/*   Solved: 2024/06/26 16:04:07 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string input = Console.ReadLine();
string[] num = input.Split(' ');

long ans = 0;

for (int i = 0 ; i < num.Length ; i++)
{
    ans += long.Parse(num[i]);
}

Console.WriteLine(ans);