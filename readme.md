<div id="top"></div>
 

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
 

<h3 align="center">Complexity and Sorting</h3>

  <p align="center">
    Sorting height, base area and volume using different sorting algorithms
    <br />
 
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li> 
   <li><a href="#analysis">Complexity analysis (Radix sorting)</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This application sorts the following shapes regarding their Heights, Base Area and Volume: 

1. Cylinder
2. Cone
3. Prisms
  - Square Base
  - Equilateral Triangle Base
  - Pentagon Base
  - Octagon Base
4. Pyramids

The following algorithms are used: 

1. Bubble sort
2. Selection sort
3. Insertion sort
4. Merge sort
5. Quick sort
6. Our own choice of sorting algorithm (Radix Sort in our case)

It also comes with a time-keeper so that we can see the running time of each algorithm. 


<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

* [Java](https://www.java.com/)
 

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

 
## Usage

File name F, the compare type and the sort type are provided as parameters (-f –t –s or -F –T –S) via command line. 
The program must be order and case insensitive. For example, all examples below are valid inputs:

java -jar sort.jar –fpolyfor1.txt –Tv –Sb

java -jar sort.jar –ta –sQ –fpolyfor3.txt

java -jar sort.jar –tH –Fpolyfor5.txt –sB

where v is volume, h is height, a is base area, b is bubble, s is selection, i is insertion, m is merge, q is quick, and your choice of sorting algorithm is z.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- Analysis -->
## Complexity analysis (Radix sorting)

- Start with the least significant digit (the one’s position)
- Gather the same values and put them together in a bucket
- "Drain" the buckets in order


For radix sort, it's time complexity is O(n) and space complexity is also O(n).

 





 

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
