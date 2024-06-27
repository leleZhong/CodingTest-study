/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1330                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1330                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 16:30:49 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string input = Console.ReadLine();
string[] num = input.Split(' ');

int a = int.Parse(num[0]);
int b = int.Parse(num[1]);

if (a > b)
    Console.WriteLine(">");
else if (a < b)
    Console.WriteLine("<");
else if (a == b)
    Console.WriteLine("==");