/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 30802                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/30802                          #+#        #+#      #+#    */
/*   Solved: 2024/07/02 21:08:20 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
long n = long.Parse(Console.ReadLine());
long[] input = Array.ConvertAll(Console.ReadLine().Split(), long.Parse);
string[] tp = Console.ReadLine().Split();
long t = long.Parse(tp[0]);
long p = long.Parse(tp[1]);
long cnt = 0;

for (int i = 0; i < input.Length; i ++)
{
    cnt += input[i] / t;
    if (Convert.ToBoolean(input[i] % t))
        cnt++;
}

Console.WriteLine(cnt);
Console.WriteLine(n / p + " " + n % p);