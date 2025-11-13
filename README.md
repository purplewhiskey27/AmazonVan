# AmazonVan
This code is abstracting an Amazon Van

In the Amazon Van Class there are several attributes; 
license plate number 
van name 
charge level
a driver
number of packages
and whether the van is delivering

In the driver class:
a name 
a tiredness level

There are getter and mutator methods for every attribute

There are four behavior methods; 
charge up (automatically sets charge to 100%) 
deliver packages(charge goes down, package goes down, tired goes up) 
take a break (decrease tiredness)
traffic (decreases charge and increases tiredness) 



[AmazonVan Class Diagram.drawio](https://github.com/user-attachments/files/23487980/AmazonVan.Class.Diagram.drawio)
<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (X11; CrOS x86_64 14541.0.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36" version="28.2.9">
  <diagram name="Page-1" id="JbrqJ7I5LiJrIdvrEhhP">
    <mxGraphModel dx="872" dy="513" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="HLvsdIppV4QpEpKIHHAE-2" value="AmazonVan" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="480" y="430" width="290" height="390" as="geometry">
            <mxRectangle x="480" y="430" width="110" height="30" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-3" value="- licensePlate : String&lt;div&gt;- charge : double&lt;/div&gt;&lt;div&gt;- numPackages : int&lt;/div&gt;&lt;div&gt;- driver : Driver&lt;/div&gt;&lt;div&gt;- delivering : boolean&lt;/div&gt;&lt;div&gt;- vanName : String&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-2">
          <mxGeometry y="26" width="290" height="104" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-4" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-2">
          <mxGeometry y="130" width="290" height="8" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-5" value="+ getPlate() : String&lt;div&gt;+ newPlates( String newPlate) : void&lt;/div&gt;&lt;div&gt;+ getCharge() : double&lt;/div&gt;&lt;div&gt;+ setCharge(double charge) : void&lt;/div&gt;&lt;div&gt;+ chargeUp() : void&lt;/div&gt;&lt;div&gt;+ getNumPackages() : int&lt;/div&gt;&lt;div&gt;+ pickUpPackages(int numPackages) : void&lt;/div&gt;&lt;div&gt;+ getDriver() : Driver&lt;/div&gt;&lt;div&gt;+ breakDuration(int breakLength) : void&lt;/div&gt;&lt;div&gt;+ isDelivering() : boolean&lt;/div&gt;&lt;div&gt;+ deliver() : void&lt;/div&gt;&lt;div&gt;+ getVanName() : String&lt;/div&gt;&lt;div&gt;+ changeVanName(String newVanName): void&lt;/div&gt;&lt;div&gt;+ toString() : String&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-2">
          <mxGeometry y="138" width="290" height="252" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-7" value="Driver" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="485" y="980" width="280" height="170" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-8" value="- tiredLevel : double&lt;div&gt;- name : String&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-7">
          <mxGeometry y="26" width="280" height="44" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-9" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-7">
          <mxGeometry y="70" width="280" height="8" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-10" value="+ getName() : String&lt;div&gt;+ changeName(String newName) : void&lt;/div&gt;&lt;div&gt;+ getTiredLevel() : double&lt;/div&gt;&lt;div&gt;+ changeTiredLevel(double tiredLevel) : void&lt;/div&gt;&lt;div&gt;+ toString() : String&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-7">
          <mxGeometry y="78" width="280" height="92" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-11" value="App" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="190" y="450" width="160" height="60" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-13" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-11">
          <mxGeometry y="26" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-14" value="main (args : String [] ) : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="HLvsdIppV4QpEpKIHHAE-11">
          <mxGeometry y="34" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-15" value="" style="endArrow=diamondThin;endFill=0;endSize=24;html=1;rounded=0;entryX=0.54;entryY=0.998;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.544;exitY=0.001;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="1" source="HLvsdIppV4QpEpKIHHAE-7" target="HLvsdIppV4QpEpKIHHAE-5">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="637" y="970" as="sourcePoint" />
            <mxPoint x="650" y="890" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="HLvsdIppV4QpEpKIHHAE-19" value="" style="endArrow=none;html=1;rounded=0;exitX=1;exitY=0.25;exitDx=0;exitDy=0;entryX=0;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="HLvsdIppV4QpEpKIHHAE-11" target="HLvsdIppV4QpEpKIHHAE-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="390" y="550" as="sourcePoint" />
            <mxPoint x="440" y="500" as="targetPoint" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
