/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10430                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10430                          #+#        #+#      #+#    */
/*   Solved: 2024/06/26 15:13:18 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string input = Console.ReadLine();
string[] words = input.Split(' ');

int a = int.Parse(words[0]);
int b = int.Parse(words[1]);
int c = int.Parse(words[2]);

Console.WriteLine((a + b) % c);
Console.WriteLine((a % c) + (b % c) % c);
Console.WriteLine((a * b) % c);
Console.WriteLine((a % c) * (b % c) % c);