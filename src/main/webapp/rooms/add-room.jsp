<%--
  Created by IntelliJ IDEA.
  User: desti
  Date: 11/27/2022
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            font-family: Consolas;
        }
    </style>
</head>
<body>
      <div style="max-width: 1000px ; margin: 3rem auto">
            <h1>Add new room</h1>

            <form action="add-room" method="post" >
            <div>
                <label>Building :</label>
                <select class="buildingIdSelect" name="building_id">
                    <option value="1">A</option>
                    <option value="2">B</option>
                    <option value="3">C</option>
                </select>

            </div>
                <div style="margin-top: 1rem">

                <label>
                    Room Name: <span class="building_code" style="background: lightgray; padding: 0 0.5rem">C</span>
                    <input required name="name">

                </label>

                </div>

                <div style="margin-top: 1rem">
                    <label>
                        Maximum number of students
                        <input name="quantity" type="number" value="3" min="1" max="10">
                    </label>
                </div>

                <button style="margin-top: 1rem ;padding: 0.2rem 2rem">Add</button>
            </form>
      </div>
    <script>
        const buildingTxt = document.querySelector(".building_code");
        const buildingIdSelect = document.querySelector(".buildingIdSelect");
        const buildings = ["A" , "B" , "C"];
        buildingIdSelect.addEventListener("change" , (e) => {
            console.log(buildings[+buildingIdSelect.value + 1]);
            buildingTxt.textContent = buildings[+buildingIdSelect.value - 1] ;
        })
    </script>
</body>
</html>
