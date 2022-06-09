# HTML introduction
Web pages are created via Hyper Text Markup Language (HTML) documents. You can think of these files as glorified web documents that provide content and styling information for your browser. When you pull up a web page your browser actually loads the content of an HTML file and renders it for you to browse.

### What do we actually need to make a web page work
All webpages have some minimum requirements for them to be fully functional
```HTML
<!DOCTYPE html> <!-- this is how you make a comment. Doctype simply tells the browser what kind of file this is -->
<html> <!-- after the doctype we need to put an opening and closing html tag. The content of our webpage goes in here -->
    <head>
        <!-- meta information and styling information goes in between the head tags -->
    </head> 
    <body>
         <!-- this is where the meat of your webpage will be located: anything the user sees/interacts with goes here -->
    </body>
</html>
```

### HTML terminology
Webpages are composed of elements: these elements are the content of the webpage that you see and interact with. Elements are composed of tags and attributes. Tags are what you place in the html file to actually create your element, whereas attributes are assigned within the tags and can be used to affect your elements

As we continue to experiement with different elements you will find that some elements will be placed on the web page one after another, whereas other elements will be rendered on the same line as the previous element. This has to do with elements being categorized as Block elements or In-Line elements. When two block elements (think two header elements) are placed one after another, because they are block elements they will be rendered on seperate lines. If we were to make two input elements next to one another they would actually render on the same line because they are considered in-line elements. So, block elements render on a new line, in-line elements render on the same line.

### CSS
If elements are used to create the content of a web page, then Cascading Style Sheet (CSS) is what makes those elements look good. Web elements by themselves provide little in the way of styling, to actually adjust the content of the elements you must apply css styling to them.