/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2753                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2753                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 18:26:55 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string input = Console.ReadLine();
short year = short.Parse(input);

if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0)
    Console.WriteLine(1);
else
    Console.WriteLine(0);