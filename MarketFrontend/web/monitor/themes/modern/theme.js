tinymce.ThemeManager.add("modern",function(a){function b(b,c){var d,e=[];if(b)return o(b.split(/[ ,]/),function(b){function f(){function c(a){return function(c,d){for(var e,f=d.parents.length;f--&&(e=d.parents[f].nodeName,"OL"!=e&&"UL"!=e););b.active(c&&e==a)}}var d=a.selection;"bullist"==g&&d.selectorChanged("ul > li",c("UL")),"numlist"==g&&d.selectorChanged("ol > li",c("OL")),b.settings.stateSelector&&d.selectorChanged(b.settings.stateSelector,function(a){b.active(a)},!0),b.settings.disabledStateSelector&&d.selectorChanged(b.settings.disabledStateSelector,function(a){b.disabled(a)})}var g;"|"==b?d=null:n.has(b)?(b={type:b,size:c},e.push(b),d=null):(d||(d={type:"buttongroup",items:[]},e.push(d)),a.buttons[b]&&(g=b,b=a.buttons[g],"function"==typeof b&&(b=b()),b.type=b.type||"button",b.size=c,b=n.create(b),d.items.push(b),a.initialized?f():a.on("init",f)))}),{type:"toolbar",layout:"flow",items:e}}function c(a){function c(c){return c?(d.push(b(c,a)),!0):void 0}var d=[];if(tinymce.isArray(m.toolbar)){if(0===m.toolbar.length)return;tinymce.each(m.toolbar,function(a,b){m["toolbar"+(b+1)]=a}),delete m.toolbar}for(var e=1;10>e&&c(m["toolbar"+e]);e++);return d.length||m.toolbar===!1||c(m.toolbar||t),d.length?{type:"panel",layout:"stack",classes:"toolbar-grp",ariaRoot:!0,ariaRemember:!0,items:d}:void 0}function d(){function b(b){var c;return"|"==b?{text:"|"}:c=a.menuItems[b]}function c(c){var d,e,f,g,h;if(h=tinymce.makeMap((m.removed_menuitems||"").split(/[ ,]/)),m.menu?(e=m.menu[c],g=!0):e=s[c],e){d={text:e.title},f=[],o((e.items||"").split(/[ ,]/),function(a){var c=b(a);c&&!h[a]&&f.push(b(a))}),g||o(a.menuItems,function(a){a.context==c&&("before"==a.separator&&f.push({text:"|"}),a.prependToContext?f.unshift(a):f.push(a),"after"==a.separator&&f.push({text:"|"}))});for(var i=0;i<f.length;i++)"|"==f[i].text&&(0!==i&&i!=f.length-1||f.splice(i,1));if(d.menu=f,!d.menu.length)return null}return d}var d,e=[],f=[];if(m.menu)for(d in m.menu)f.push(d);else for(d in s)f.push(d);for(var g="string"==typeof m.menubar?m.menubar.split(/[ ,]/):f,h=0;h<g.length;h++){var i=g[h];i=c(i),i&&e.push(i)}return e}function e(b){function c(a){var c=b.find(a)[0];c&&c.focus(!0)}a.shortcuts.add("Alt+F9","",function(){c("menubar")}),a.shortcuts.add("Alt+F10","",function(){c("toolbar")}),a.shortcuts.add("Alt+F11","",function(){c("elementpath")}),b.on("cancel",function(){a.focus()})}function f(b,c){function d(a){return{width:a.clientWidth,height:a.clientHeight}}var e,f,g,h;e=a.getContainer(),f=a.getContentAreaContainer().firstChild,g=d(e),h=d(f),null!==b&&(b=Math.max(m.min_width||100,b),b=Math.min(m.max_width||65535,b),p.setStyle(e,"width",b+(g.width-h.width)),p.setStyle(f,"width",b)),c=Math.max(m.min_height||100,c),c=Math.min(m.max_height||65535,c),p.setStyle(f,"height",c),a.fire("ResizeEditor")}function g(b,c){var d=a.getContentAreaContainer();l.resizeTo(d.clientWidth+b,d.clientHeight+c)}function h(){function c(){return a.contextToolbars||[]}function d(b){var c,d,e;return c=tinymce.DOM.getPos(a.getContentAreaContainer()),d=a.dom.getRect(b),e=a.dom.getRoot(),"BODY"==e.nodeName&&(d.x-=e.ownerDocument.documentElement.scrollLeft||e.scrollLeft,d.y-=e.ownerDocument.documentElement.scrollTop||e.scrollTop),d.x+=c.x,d.y+=c.y,d}function e(){o(a.contextToolbars,function(a){a.panel&&a.panel.hide()})}function f(a,b,c){b=b?b.substr(0,2):"",o({t:"down",b:"up"},function(d,e){a.classes.toggle("arrow-"+d,c(e,b.substr(0,1)))}),o({l:"left",r:"right"},function(d,e){a.classes.toggle("arrow-"+d,c(e,b.substr(1,1)))})}function g(a){return{left:a.x,top:a.y,width:a.w,height:a.h,right:a.x+a.w,bottom:a.y+a.h}}function h(a,b,c,d,e){return e=g({x:a,y:b,w:e.w,h:e.h}),m.inline_toolbar_position_handler&&(e=m.inline_toolbar_position_handler({elementRect:g(c),contentAreaRect:g(d),panelRect:e})),e}function i(a,b){a.moveTo(b.left,b.top)}function j(b){var c,g,j,k,l,m,n;if(!a.removed){if(!b||!b.toolbar.panel)return void e();n=["bc-tc","tc-bc","tl-bl","bl-tl","tr-br","br-tr"],l=b.toolbar.panel,l.show(),j=d(b.element),g=tinymce.DOM.getRect(l.getEl()),k=tinymce.DOM.getRect(a.getContentAreaContainer()||a.getBody()),j.w=b.element.clientWidth,j.h=b.element.clientHeight,a.inline||(k.w=a.getDoc().documentElement.offsetWidth),a.selection.controlSelection.isResizable(b.element)&&(j=q.inflate(j,0,8)),c=q.findBestRelativePosition(g,j,k,n),j=q.clamp(j,k),c?(m=q.relativePosition(g,j,c),i(l,h(m.x,m.y,j,k,g))):(k.h+=40,j=q.intersect(k,j),j?(c=q.findBestRelativePosition(g,j,k,["bc-tc","bl-tl","br-tr"]),c?(m=q.relativePosition(g,j,c),i(l,h(m.x,m.y,j,k,g))):i(l,h(j.x,j.y,j,k,g))):l.hide()),f(l,c,function(a,b){return(!j||j.w>40)&&a===b})}}function k(){function b(){a.selection&&j(s(a.selection.getNode()))}tinymce.util.Delay.requestAnimationFrame(b)}function l(){t||(t=a.selection.getScrollContainer()||a.getWin(),tinymce.$(t).on("scroll",k),a.on("remove",function(){tinymce.$(t).off("scroll")}))}function p(c){var d;return c.toolbar.panel?(c.toolbar.panel.show(),void j(c)):(l(),d=n.create({type:"floatpanel",role:"dialog",classes:"tinymce tinymce-inline arrow",ariaLabel:"Inline toolbar",layout:"flex",direction:"column",align:"stretch",autohide:!1,autofix:!0,fixed:!0,border:1,items:b(c.toolbar.items),oncancel:function(){a.focus()}}),c.toolbar.panel=d,d.renderTo(document.body).reflow(),void j(c))}function r(){tinymce.each(c(),function(a){a.panel&&a.panel.hide()})}function s(b){var d,e,f,g=c();for(f=a.$(b).parents().add(b),d=f.length-1;d>=0;d--)for(e=g.length-1;e>=0;e--)if(g[e].predicate(f[d]))return{toolbar:g[e],element:f[d]};return null}var t;a.on("click keyup setContent",function(b){("setcontent"!=b.type||b.selection)&&tinymce.util.Delay.setEditorTimeout(a,function(){var b;b=s(a.selection.getNode()),b?(r(),p(b)):r()})}),a.on("blur hide",r),a.on("ObjectResizeStart",function(){var b=s(a.selection.getNode());b&&b.toolbar.panel&&b.toolbar.panel.hide()}),a.on("nodeChange ResizeEditor ResizeWindow",k),a.on("remove",function(){tinymce.each(c(),function(a){a.panel&&a.panel.remove()}),a.contextToolbars={}}),a.shortcuts.add("ctrl+alt+e > ctrl+alt+p","",function(){var b=s(a.selection.getNode());b&&b.toolbar.panel&&b.toolbar.panel.items()[0].focus()})}function i(a){return function(){a.initialized?a.fire("SkinLoaded"):a.on("init",function(){a.fire("SkinLoaded")})}}function j(b){function f(){if(o&&o.moveRel&&o.visible()&&!o._fixed){var b=a.selection.getScrollContainer(),c=a.getBody(),d=0,e=0;if(b){var f=p.getPos(c),g=p.getPos(b);d=Math.max(0,g.x-f.x),e=Math.max(0,g.y-f.y)}o.fixed(!1).moveRel(c,a.rtl?["tr-br","br-tr"]:["tl-bl","bl-tl","tr-br"]).moveBy(d,e)}}function g(){o&&(o.show(),f(),p.addClass(a.getBody(),"mce-edit-focus"))}function j(){o&&(o.hide(),r.hideAll(),p.removeClass(a.getBody(),"mce-edit-focus"))}function k(){return o?void(o.visible()||g()):(o=l.panel=n.create({type:q?"panel":"floatpanel",role:"application",classes:"tinymce tinymce-inline",layout:"flex",direction:"column",align:"stretch",autohide:!1,autofix:!0,fixed:!!q,border:1,items:[m.menubar===!1?null:{type:"menubar",border:"0 0 1 0",items:d()},c(m.toolbar_items_size)]}),a.fire("BeforeRenderUI"),o.renderTo(q||document.body).reflow(),e(o),g(),h(),a.on("nodeChange",f),a.on("activate",g),a.on("deactivate",j),void a.nodeChanged())}var o,q;return m.fixed_toolbar_container&&(q=p.select(m.fixed_toolbar_container)[0]),m.content_editable=!0,a.on("focus",function(){b.skinUiCss?tinymce.DOM.styleSheetLoader.load(b.skinUiCss,k,k):k()}),a.on("blur hide",j),a.on("remove",function(){o&&(o.remove(),o=null)}),b.skinUiCss&&tinymce.DOM.styleSheetLoader.load(b.skinUiCss,i(a)),{}}function k(b){function g(){return function(a){"readonly"==a.mode?j.find("*").disabled(!0):j.find("*").disabled(!1)}}var j,k,o;return b.skinUiCss&&tinymce.DOM.styleSheetLoader.load(b.skinUiCss,i(a)),j=l.panel=n.create({type:"panel",role:"application",classes:"tinymce",style:"visibility: hidden",layout:"stack",border:1,items:[m.menubar===!1?null:{type:"menubar",border:"0 0 1 0",items:d()},c(m.toolbar_items_size),{type:"panel",name:"iframe",layout:"stack",classes:"edit-area",html:"",border:"1 0 0 0"}]}),m.resize!==!1&&(k={type:"resizehandle",direction:m.resize,onResizeStart:function(){var b=a.getContentAreaContainer().firstChild;o={width:b.clientWidth,height:b.clientHeight}},onResize:function(a){"both"==m.resize?f(o.width+a.deltaX,o.height+a.deltaY):f(null,o.height+a.deltaY)}}),m.statusbar!==!1&&j.add({type:"panel",name:"statusbar",classes:"statusbar",layout:"flow",border:"1 0 0 0",ariaRoot:!0,items:[{type:"elementpath"},k]}),a.fire("BeforeRenderUI"),a.on("SwitchMode",g()),j.renderBefore(b.targetNode).reflow(),m.readonly&&a.setMode("readonly"),m.width&&tinymce.DOM.setStyle(j.getEl(),"width",m.width),a.on("remove",function(){j.remove(),j=null}),e(j),h(),{iframeContainer:j.find("#iframe")[0].getEl(),editorContainer:j.getEl()}}var l=this,m=a.settings,n=tinymce.ui.Factory,o=tinymce.each,p=tinymce.DOM,q=tinymce.geom.Rect,r=tinymce.ui.FloatPanel,s={file:{title:"File",items:"newdocument"},edit:{title:"Edit",items:"undo redo | cut copy paste pastetext | selectall"},insert:{title:"Insert",items:"|"},view:{title:"View",items:"visualaid |"},format:{title:"Format",items:"bold italic underline strikethrough superscript subscript | formats | removeformat"},table:{title:"Table"},tools:{title:"Tools"}},t="undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image";l.renderUI=function(b){var c=m.skin!==!1?m.skin||"lightgray":!1;if(c){var d=m.skin_url;d=d?a.documentBaseURI.toAbsolute(d):tinymce.baseURL+"/skins/"+c,tinymce.Env.documentMode<=7?b.skinUiCss=d+"/skin.ie7.min.css":b.skinUiCss=d+"/skin.min.css",a.contentCSS.push(d+"/content"+(a.inline?".inline":"")+".min.css")}return a.on("ProgressState",function(a){l.throbber=l.throbber||new tinymce.ui.Throbber(l.panel.getEl("body")),a.state?l.throbber.show(a.time):l.throbber.hide()}),m.inline?j(b):k(b)},l.resizeTo=f,l.resizeBy=g});