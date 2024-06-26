/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2525                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2525                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 19:00:10 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string[] input = Console.ReadLine().Split(' ');
string input2 = Console.ReadLine();

int h = int.Parse(input[0]);
int m = int.Parse(input[1]);
int t = int.Parse(input2);
int output = m + t;

int tmp = output / 60;

h += tmp;
output -= 60 * tmp;

if (h >= 24)
    h %= 24;

Console.WriteLine(h + " " + output);