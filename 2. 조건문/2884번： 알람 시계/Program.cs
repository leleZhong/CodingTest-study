/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2884                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2884                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 18:44:44 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string[] input = Console.ReadLine().Split(' ');
int h = int.Parse(input[0]);
int m = int.Parse(input[1]);
int alarm = m - 45;

if (alarm >= 0)
    Console.WriteLine(h + " " + alarm);
else
{
    if (h == 0)
        h = 24;
    Console.WriteLine((h - 1) + " " + (60 + alarm));
}