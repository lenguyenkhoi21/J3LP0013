<%--
  Created by IntelliJ IDEA.
  User: Milu
  Date: 9/29/2020
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<div class="header">
    <h1>The ShuShi Restaurant</h1>
    <span>Welcome to this website</span>
</div>
<div class="menu">
    <a class="${active == 'HomeColor' ? 'setBold' : ''}" href="HomeController">Home</a>
    <a class="${active == 'MenuColor' ? 'setBold' : ''}" href="MenuController">Menu and Price list</a>
    <a class="${active == 'FindUsColor' ? 'setBold' : ''}" href="InfoController">Find us</a>
</div>