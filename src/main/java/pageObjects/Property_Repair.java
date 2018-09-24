package pageObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Property_Repair {

	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
		
	public Property_Repair(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 323
/**************************/	
	
	/******ROOFING*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Roofing' AND visible == 1")
	public IOSElement roofingHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'No Repair' AND visible == 1")
	public IOSElement noRepairLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'No Repairs'] and @visible = true]")
	public IOSElement noRepairCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Repair Type' AND visible == 1")
	public IOSElement repairTypeLabel;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Select one of the following' AND visible == 1")
	public IOSElement selectOneOfTheFollowingLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace All' AND visible == 1")
	public IOSElement replaceAllLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Repair' AND visible == 1")
	public IOSElement repairLabel;

	@iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Replace All'] and @visible = true])[1]")
	public IOSElement replaceAllCheckBox;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Repair'] and @visible = true])[2]")
	public IOSElement repairCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Re-Deck' AND visible == 1")
	public IOSElement reDeckLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Re-Deck'] and @visible = true]")
	public IOSElement reDeckCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Paint Tile Roof' AND visible == 1")
	public IOSElement paintTileRoofLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Paint Tile Roof'] and @visible = true]")
	public IOSElement paintTileRoofCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Roof Information' AND visible == 1")
	public IOSElement roofInformationLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Roof Pitch' AND visible == 1")
	public IOSElement roofPitchLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Roof Pitch'] and @visible = true]")
	public IOSElement roofPitchTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Roofing Material' AND visible == 1")
	public IOSElement roofingMaterialLabel;
	
		/*******ROOFING MATERIAL DROPDOWN****/	
	
		@iOSXCUITFindBy(accessibility="None")
		public IOSElement none;
	
		@iOSXCUITFindBy(accessibility="3-Tab")
		public IOSElement threeTab;
	
		@iOSXCUITFindBy(accessibility="Dimensional")
		public IOSElement dimensional;
	
		@iOSXCUITFindBy(accessibility="Hot Tar")
		public IOSElement hotTar;
	
		@iOSXCUITFindBy(accessibility="Roll Roofing")
		public IOSElement rollRoofing;
	
		@iOSXCUITFindBy(accessibility="Tile")
		public IOSElement tile;
		/********/	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Roof Material'] and @visible = true]")
	public IOSElement roofingMaterialDropDown;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Current Number of Layers' AND visible == 1")
	public IOSElement currentNumberOfLayersLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Current Number of Layers'] and @visible = true]")
	public IOSElement currentNumberOfLayersTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Soffit' AND visible == 1")
	public IOSElement soffitLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Soffit'] and @visible = true]")
	public IOSElement soffitTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Gutters' AND visible == 1")
	public IOSElement guttersLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Gutters'] and @visible = true]")
	public IOSElement guttersTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Pricing Profile Features' AND visible == 1")
	public IOSElement pricingProfileElementLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Added Features'")
	public IOSElement addedFeaturesLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Custom Estimate' AND visible == 1")
	public IOSElement customEstimateLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Custom Estimate'] and @visible = true]")
	public IOSElement customEstimateTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Notes' AND visible == 1")
	public IOSElement notesLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Notes'] and @visible = true]")
	public IOSElement notesTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND visible == 1 AND name CONTAINS 'out of 160 characters'")
	public IOSElement notesCharacter;
	
	/****DOORS & WINDOWS*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Doors & Windows' AND visible == 1")
	public IOSElement doorAndWindowsHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Doors' AND visible == 1")
	public IOSElement doorsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Entry Door' AND visible == 1")
	public IOSElement entryDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Entry Door'] and @visible = true]")
	public IOSElement entryDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Sliding Patio Glass' AND visible == 1")
	public IOSElement slidingPatioGlassLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Sliding Patio Glass'] and @visible = true]")
	public IOSElement slidingPatioGlassTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Service Door' AND visible == 1")
	public IOSElement serviceDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Service Door'] and @visible = true]")
	public IOSElement serviceDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Vinyl Sliding Patio Door' AND visible == 1")
	public IOSElement vinylSlidingPatioDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Vinyl Sliding Patio Door'] and @visible = true]")
	public IOSElement vinylSlidingPatioTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Screen Door' AND visible == 1")
	public IOSElement screenDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Screen Door'] and @visible = true]")
	public IOSElement screenDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wood Sliding Patio Door' AND visible == 1")
	public IOSElement woodSlidingPatioDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Wood Sliding Patio Door'] and @visible = true]")
	public IOSElement woodSlidingPatioDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Interior Door' AND visible == 1")
	public IOSElement interiorDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Interior Door'] and @visible = true]")
	public IOSElement interiorDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'French Door' AND visible == 1")
	public IOSElement frenchDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'French Door'] and @visible = true]")
	public IOSElement frenchDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Door and Base Trim' AND visible == 1")
	public IOSElement doorAndBaseTrimLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Door and Base Trim'] and @visible = true]")
	public IOSElement doorAndBaseTrimTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Single Garage Door' AND visible == 1")
	public IOSElement singleGarageDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Single Garage Door'] and @visible = true]")
	public IOSElement singleGarageDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Door Jamb' AND visible == 1")
	public IOSElement doorJambLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Door Jamb'] and @visible = true]")
	public IOSElement doorJambTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Double Garage Door' AND visible == 1")
	public IOSElement doubleGarageDoorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Double Garage Door'] and @visible = true]")
	public IOSElement doubleGarageDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Door Knobs in House' AND visible == 1")
	public IOSElement replaceDoorKnobsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Replace Door Knobs in House'] and @visible = true]")
	public IOSElement doubleGarageDoorCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Windows' AND visible == 1")
	public IOSElement windowsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Windows Type' AND visible == 1")
	public IOSElement windowsTypeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Windows Type'] and @visible = true]")
	public IOSElement windowTypeDropDown;
	
		/*****WINDOWS TYPES DROPDOWN**/
	
		@iOSXCUITFindBy(accessibility="Vinyl")
		public IOSElement vinyl;
	
		@iOSXCUITFindBy(accessibility="Wood")
		public IOSElement wood;
	
		/**********/
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Windows Type'] and @visible = true]")
	public IOSElement windowsTextFLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Windows Type'] and @visible = true]")
	public IOSElement windowsSmallTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Windows Type'] and @visible = true]")
	public IOSElement windowsMediumTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[3][preceding::XCUIElementTypeStaticText[@name = 'Windows Type'] and @visible = true]")
	public IOSElement windowsLargeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Glass' AND visible == 1")
	public IOSElement glassLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Windows'] and @visible = true]")
	public IOSElement glassSmallTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Windows'] and @visible = true]")
	public IOSElement glassMediumTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[3][preceding::XCUIElementTypeStaticText[@name = 'Windows'] and @visible = true]")
	public IOSElement glassLargeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wrap Outside Window' AND visible == 1")
	public IOSElement wrapOutsideWindowLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Glass'] and @visible = true]")
	public IOSElement wrapOutsideCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Number of Windows' AND visible == 1")
	public IOSElement numberOfWindowsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Number of Windows'] and @visible = true]")
	public IOSElement numberOfWindowsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Blinds in House' AND visible == 1")
	public IOSElement replaceBlindsInHouseLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Wrap Outside Window'] and @visible = true]")
	public IOSElement replaceBindsCheckBox;
	
	/********EXTERIOR PAINT & SIDING******/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Exterior Paint & Siding' AND visible == 1")
	public IOSElement exteriorPaintAndSidingHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Paint' AND visible == 1")
	public IOSElement paintLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Paint'] and @visible = true]")
	public IOSElement paintCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Siding' AND visible == 1")
	public IOSElement sidingLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Paint'] and @visible = true]")
	public IOSElement sidingCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Percentage of Exterior to be Painted' AND visible == 1")
	public IOSElement percentageExteriorToPaintLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Percentage of Exterior to be Painted'] and @visible = true]")
	public IOSElement percentageExteriorToPaintTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Include Soffit' AND visible == 1")
	public IOSElement includeSoffitLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Percentage of Exterior to be Painted'] and @visible = true]")
	public IOSElement includeSoffitCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Siding with Vinyl Siding' AND visible == 1")
	public IOSElement replaceSidingWithVinylLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Replace Siding with Vinyl Siding'] and @visible = true]")
	public IOSElement replaceSidingWithVinylCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Siding with Fiber Cement Board' AND visible == 1")
	public IOSElement replaceSidingWithFiberLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Replace Siding with Vinyl Siding'] and @visible = true]")
	public IOSElement replaceSidingWithFiberCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Percentage of Exterior to be Power Washed' AND visible == 1")
	public IOSElement percentageExteriorPowerWashedLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Percentage of Exterior to be Power Washed'] and @visible = true]")
	public IOSElement percentageExteriorPowerWashedTextField;
	
	/******FOUNDATION*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Foundation' AND visible == 1")
	public IOSElement foundationHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Foundation Type' AND visible == 1")
	public IOSElement foundationTypeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Replace Siding with Vinyl Siding'] and @visible = true]")
	public IOSElement foundationDropDown;
	
		/*****FOUNDATION TYPE DROPDOWN*****/
		
		@iOSXCUITFindBy(accessibility="Pier and Beam Concrete Perimeter")
		public IOSElement pierAndBeamConcretePerimeter;
		
		@iOSXCUITFindBy(accessibility="Slab")
		public IOSElement slab;
		
		@iOSXCUITFindBy(accessibility="Post Pier")
		public IOSElement postPier;
		
		/*******/
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Complete Foundation Repair' AND visible == 1")
	public IOSElement completeFoundationRepairLabel;	
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Complete Foundation Repair'] and @visible = true]")
	public IOSElement completeFoundationRepairCheckBox;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Piers' AND visible == 1")
	public IOSElement replacePiersLabel;	
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Complete Foundation Repair'] and @visible = true]")
	public IOSElement replacePiersCheckBox;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Pegging' AND visible == 1")
	public IOSElement peggingLabel;	
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Pegging'] and @visible = true]")
	public IOSElement peggingCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Basement' AND visible == 1")
	public IOSElement basementLabel;	
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Basement'] and @visible = true]")
	public IOSElement basementCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Through Floor Post' AND visible == 1")
	public IOSElement throughFloorPostLabel;	
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Through Floor Post'] and @visible = true]")
	public IOSElement throughFloorPostCheckBox;
	
	/****EXTERNAL/FUNCTIONAL OBSOLESCENCE****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'External/Functional Obsolescence' AND visible == 1")
	public IOSElement externalFunctionalObsolescenceHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Very busy street' AND visible == 1")
	public IOSElement veryBusyLabel;	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Very busy street'] and @visible = true]")
	public IOSElement veryBusyCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Very busy street'] and @visible = true]")
	public IOSElement veryBusyDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Very busy street'] and @visible = true]")
	public IOSElement veryBusyCost;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'High tension lines next to house' AND visible == 1")
	public IOSElement highTensionLinesLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'High tension lines next to house'] and @visible = true]")
	public IOSElement highTensionLinesCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'High tension lines next to house'] and @visible = true]")
	public IOSElement highTensionLinesDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'High tension lines next to house'] and @visible = true]")
	public IOSElement highTensionLinesCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Commercial property next door' AND visible == 1")
	public IOSElement commercialPropertyLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Commercial property next door'] and @visible = true]")
	public IOSElement commercialPropertyCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Commercial property next door'] and @visible = true]")
	public IOSElement commercialPropertyDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Commercial property next door'] and @visible = true]")
	public IOSElement commercialPropertyCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Apartment near by' AND visible == 1")
	public IOSElement apartmentNearLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Apartment near by'] and @visible = true]")
	public IOSElement apartmentNearCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Apartment near by'] and @visible = true]")
	public IOSElement apartmentNearDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Apartment near by'] and @visible = true]")
	public IOSElement apartmentNearCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Previously known flooding' AND visible == 1")
	public IOSElement previouslyKnownLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Previously known flooding'] and @visible = true]")
	public IOSElement previouslyKnownCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Previously known flooding'] and @visible = true]")
	public IOSElement previouslyKnownDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Previously known flooding'] and @visible = true]")
	public IOSElement previouslyKnownCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Poor flood plan' AND visible == 1")
	public IOSElement poorFloodLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Poor flood plan'] and @visible = true]")
	public IOSElement poorFloodCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Poor flood plan'] and @visible = true]")
	public IOSElement poorFloodDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Poor flood plan'] and @visible = true]")
	public IOSElement poorFloodCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Septic tanks installed where surrounding have city sewer' AND visible == 1")
	public IOSElement septicTanksLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Septic tanks installed where surrounding have city sewer'] and @visible = true]")
	public IOSElement septicTanksCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Septic tanks installed where surrounding have city sewer'] and @visible = true]")
	public IOSElement septicTanksDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Septic tanks installed where surrounding have city sewer'] and @visible = true]")
	public IOSElement septicTanksCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Lower than the typical pitched roof camps' AND visible == 1")
	public IOSElement lowerThanTheTypicalLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Lower than the typical pitched roof camps'] and @visible = true]")
	public IOSElement lowerThanTheTypicalCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[preceding::XCUIElementTypeStaticText[@name = 'Lower than the typical pitched roof camps'] and @visible = true]")
	public IOSElement lowerThanTheTypicalDropDown;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Lower than the typical pitched roof camps'] and @visible = true]")
	public IOSElement lowerThanTheTypicalCost;
	
	@iOSXCUITBy(className="XCUIElementTypePickerWheel")
	public IOSElement percentage;
	
	/*****KITCHEN*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Kitchen' AND visible == 1")
	public IOSElement kitchenHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Cabinets' AND visible == 1")
	public IOSElement cabinetsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace' AND visible == 1")
	public IOSElement replaceLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Upgrade' AND visible == 1")
	public IOSElement upgradeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Paint'] and @visible = true]")
	public IOSElement replaceCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Paint'] and @visible = true]")
	public IOSElement upgradeCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[3][preceding::XCUIElementTypeStaticText[@name = 'Paint'] and @visible = true]")
	public IOSElement paintCabinetCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Countertops' AND visible == 1")
	public IOSElement countertopsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Countertops'] and @visible = true]")
	public IOSElement replaceAfterCountertopsCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Countertops'] and @visible = true]")
	public IOSElement replaceAfterCountertopsTextField;	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Replace' and preceding::XCUIElementTypeStaticText[@name = 'Countertops']] and @name = 'Upgrade' and @visible = 'true']")	
	public IOSElement upgradeAfterCountertopsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Upgrade' and preceding::XCUIElementTypeStaticText[@name = 'Countertops']] and @visible = 'true']")	
	public IOSElement upgradeAfterCountertopsCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Appliances' AND visible == 1")
	public IOSElement appliancesLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Dishwasher' AND visible == 1")
	public IOSElement dishwasherLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Dishwasher'] and @visible = true]")
	public IOSElement dishwasherTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Range Hood' AND visible == 1")
	public IOSElement rangeHoodLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Dishwasher'] and @visible = true]")
	public IOSElement rangeHoodTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Refrigerator' AND visible == 1")
	public IOSElement refrigeratorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Refrigerator'] and @visible = true]")
	public IOSElement refrigeratorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Stove Top' AND visible == 1")
	public IOSElement stoveTopLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Stove Top'] and @visible = true]")
	public IOSElement stoveTopTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Kitchen Sink' AND visible == 1")
	public IOSElement kitchenSinkLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Kitchen Sink'] and @visible = true]")
	public IOSElement kitchenSinkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Microwave' AND visible == 1")
	public IOSElement microwaveLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Microwave'] and @visible = true]")
	public IOSElement microwaveTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Range' AND visible == 1")
	public IOSElement rangeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Range'] and @visible = true]")
	public IOSElement rangeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Garbage Disposal' AND visible == 1")
	public IOSElement garbageDisposalLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Garbage Disposal'] and @visible = true]")
	public IOSElement garbageDiposalTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Linear Feet' AND visible == 1")
	public IOSElement linearFeatLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Linear Feat'] and @visible = true]")
	public IOSElement LinearFeatTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Stainless Steel Surcharge' AND visible == 1")
	public IOSElement stainlessSteelSurchargeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Stainless Steel Surcharge'] and @visible = true]")
	public IOSElement stainlessSteelSurchargeCheckBox;
	
	/****BATHROOM****/	
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Bathroom' AND visible == 1")
	public IOSElement bathroomHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Vanity' AND visible == 1")
	public IOSElement vanityLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Vanity'] and @visible = true]")
	public IOSElement vanityTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Kit' AND visible == 1")
	public IOSElement showerKitLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Shower Kit'] and @visible = true]")
	public IOSElement showerKitTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Sink' AND visible == 1")
	public IOSElement sinkLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Sink'] and @visible = true]")
	public IOSElement sinkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Pan' AND visible == 1")
	public IOSElement showerPanLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Shower Pan'] and @visible = true]")
	public IOSElement showerPanTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Toilet' AND visible == 1")
	public IOSElement toiletLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Toilet'] and @visible = true]")
	public IOSElement toiletTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Stall Tile' AND visible == 1")
	public IOSElement showerStallTileLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Shower Stall Tile'] and @visible = true]")
	public IOSElement showerStallTileTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tub' AND visible == 1")
	public IOSElement tubLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Tub'] and @visible = true]")
	public IOSElement tubTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Full Wall Tile' AND visible == 1")
	public IOSElement fullWallTileLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Full Wall Tile'] and @visible = true]")
	public IOSElement fullWallTileTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tile Around Tub' AND visible == 1")
	public IOSElement tileAroundTubLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Tile Around Tub'] and @visible = true]")
	public IOSElement tileAroundTubTextField;
	
	/****INTERIOR PAINT****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Interior Paint' AND visible == 1")
	public IOSElement interiorPaintHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'All Interior' AND visible == 1")
	public IOSElement allInteriorLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Closet Doors' AND visible == 1")
	public IOSElement closetDoorsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'All Interior'] and @visible = true]")
	public IOSElement allInteriorCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'All Interior'] and @visible = true]")
	public IOSElement doorsCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[3][preceding::XCUIElementTypeStaticText[@name = 'All Interior'] and @visible = true]")
	public IOSElement closetDoorsCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Trim' AND visible == 1")
	public IOSElement trimLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wood Window' AND visible == 1")
	public IOSElement woodWindowLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Trim'] and @visible = true]")
	public IOSElement woodWindowCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Trim'] and @visible = true]")
	public IOSElement trimCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Ceilings' AND visible == 1")
	public IOSElement ceilingsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Ceilings'] and @visible = true]")
	public IOSElement ceilingCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Ceilings'] and @visible = true]")
	public IOSElement ceilingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Walls' AND visible == 1")
	public IOSElement wallsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Walls'] and @visible = true]")
	public IOSElement wallsCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Walls'] and @visible = true]")
	public IOSElement wallsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Remove Popcorn Ceiling' AND visible == 1")
	public IOSElement removePopcornCeilingLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Remove Popcorn Ceiling'] and @visible = true]")
	public IOSElement removePopcornCeilingCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Remove Popcorn Ceiling'] and @visible = true]")
	public IOSElement removePopcornCeilingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Drywall' AND visible == 1")
	public IOSElement dryWallLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Whole House' AND visible == 1")
	public IOSElement replaceWholeHouseLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Repair a Selection' AND visible == 1")
	public IOSElement repairASelectionLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Replace Whole House'] and @visible = true]")
	public IOSElement replaceWholeHouseCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Replace Whole House'] and @visible = true]")
	public IOSElement repairASelectionCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Number of Rooms to Repair' AND visible == 1")
	public IOSElement numberofRoomToRepairLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Number of Rooms to Repair'] and @visible = true]")
	public IOSElement numberofRoomToRepairTextField;
	
	/*****FLOORING****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Flooring' AND visible == 1")
	public IOSElement flooringHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Enter the percentage of flooring to be replaced, percentage does not need to add up to 100.' AND visible == 1")
	public IOSElement enterPercentageLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tile/Laminate' AND visible == 1")
	public IOSElement tileLaminateLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Tile/Laminate'] and @visible = true]")
	public IOSElement tileLaminateTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Tile/Laminate'] and @visible = true]")
	public IOSElement tileResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'New Hardwood' AND visible == 1")
	public IOSElement newHardwoodLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'New Hardwood'] and @visible = true]")
	public IOSElement newHardwoodTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'New Hardwood'] and @visible = true]")
	public IOSElement newHardwoodResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Refinish Hardwood' AND visible == 1")
	public IOSElement refinishHardwoodLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Refinish Hardwood'] and @visible = true]")
	public IOSElement refinishHardwoodTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Refinish Hardwood'] and @visible = true]")
	public IOSElement refinishHardwoodResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Carpet' AND visible == 1")
	public IOSElement carpetLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Carpet'] and @visible = true]")
	public IOSElement carpetTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Carpet'] and @visible = true]")
	public IOSElement carpetResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Linoleum' AND visible == 1")
	public IOSElement linoleumLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Linoleum'] and @visible = true]")
	public IOSElement linoleumTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Linoleum'] and @visible = true]")
	public IOSElement linoleumResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Total to be Repaired' AND visible == 1")
	public IOSElement totalToBeRepairedLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[1][preceding::XCUIElementTypeStaticText[@name = 'Total to be Repaired'] and @visible = true]")
	public IOSElement totalToBeRepairedPercentage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[2][preceding::XCUIElementTypeStaticText[@name = 'Total to be Repaired'] and @visible = true]")
	public IOSElement totalToBeRepairedResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Total not Repaired' AND visible == 1")
	public IOSElement totalNotRepairedLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[1][preceding::XCUIElementTypeStaticText[@name = 'Total not Repaired'] and @visible = true]")
	public IOSElement totalNotRepairedPercentage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[2][preceding::XCUIElementTypeStaticText[@name = 'Total not Repaired'] and @visible = true]")
	public IOSElement totalNotRepairedResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Baseboard Trim' AND visible == 1")
	public IOSElement baseboardLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Baseboard Trim'] and @visible = true]")
	public IOSElement baseboardCheckBox;
	
	/****PLUMBING****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Plumbing' AND visible == 1")
	public IOSElement plumbingHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replumb House' AND visible == 1")
	public IOSElement replumbHouseLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Replumb House'] and @visible = true]")
	public IOSElement replumbHouseCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Hot Water Tank' AND visible == 1")
	public IOSElement hotWaterTankLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Replumb House'] and @visible = true]")
	public IOSElement hotWaterTankCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Gas' AND visible == 1")
	public IOSElement gasLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Gas'] and @visible = true]")
	public IOSElement gasCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Electric' AND visible == 1")
	public IOSElement electricLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Gas'] and @visible = true]")
	public IOSElement electricCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Plumbing Fixtures' AND visible == 1")
	public IOSElement replacePlumbingFixturesLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Replace Plumbing Fixtures'] and @visible = true]")
	public IOSElement replacePlumbingFixturesCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Septic Tank' AND visible == 1")
	public IOSElement replaceSepticTankLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Replace Plumbing Fixtures'] and @visible = true]")
	public IOSElement replaceSepticTankCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Town Sewer Tie-In' AND visible == 1")
	public IOSElement townSewerLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[3][preceding::XCUIElementTypeStaticText[@name = 'Replace Plumbing Fixtures'] and @visible = true]")
	public IOSElement townSewerCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Non Conforming Lot/Off Season' AND visible == 1")
	public IOSElement nonConformingLotLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Non Conforming Lot/Off Season'] and @visible = true]")
	public IOSElement nonConformingLotCheckBox;
	
	/****HVAC****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'HVAC' AND visible == 1")
	public IOSElement hVACHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Cleaning and Service' AND visible == 1")
	public IOSElement cleaningAndServiceLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Cleaning and Service'] and @visible = true]")
	public IOSElement cleaningAndServiceCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Cleaning and Service'] and @visible = true]")
	public IOSElement replaceAllHVACCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Insulation' AND visible == 1")
	public IOSElement insulationLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Insulation' AND visible == 1")
	public IOSElement replaceInsulationLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Replace Insulation'] and @visible = true]")
	public IOSElement replaceInsulationCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Walls'] and @visible = true]")
	public IOSElement wallsHVACCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Ceilings'] and @visible = true]")
	public IOSElement ceilingsHVACCheckBox;
	
	/****ELECTRICAL****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Electrical' AND visible == 1")
	public IOSElement electricalHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Rewire Entire House' AND visible == 1")
	public IOSElement rewireEntireHouseLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Rewire Entire House'] and @visible = true]")
	public IOSElement rewireEntireHouseCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Other Repairs' AND visible == 1")
	public IOSElement otherRepairsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Select all that apply' AND visible == 1")
	public IOSElement selectAllThatApplyLabel;

	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Service Upgrade' AND visible == 1")
	public IOSElement serviceUpgradeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1][preceding::XCUIElementTypeStaticText[@name = 'Service Upgrade'] and @visible = true]")
	public IOSElement serviceUpgradeCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace All Switches and Outlets' AND visible == 1")
	public IOSElement replaceAllSwitchesLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[2][preceding::XCUIElementTypeStaticText[@name = 'Service Upgrade'] and @visible = true]")
	public IOSElement replaceAllSwitchesCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Smoke Detector' AND visible == 1")
	public IOSElement smokeDetectorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name = 'Smoke Detector'] and @visible = true]")
	public IOSElement smokeDetectorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'CO Detector' AND visible == 1")
	public IOSElement coDetectorLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name = 'Smoke Detector'] and @visible = true]")
	public IOSElement coDetectorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'GFI' AND visible == 1")
	public IOSElement gfiLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'GFI'] and @visible = true]")
	public IOSElement gfiTextField;
	
	/****FIXTURES****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Fixtures' AND visible == 1")
	public IOSElement fixturesHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Internal' AND visible == 1")
	public IOSElement internalLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Fans' AND visible == 1")
	public IOSElement fanLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Fans'] and @visible = true]")
	public IOSElement fansTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Fans'] and @visible = true]")
	public IOSElement lightingFixturesInternalLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Fans'] and @visible = true]")
	public IOSElement lightingFixturesInternalTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'External' AND visible == 1")
	public IOSElement externalLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'External'] and @visible = true]")
	public IOSElement lightingFixturesExternalLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'External'] and @visible = true]")
	public IOSElement lightingFixturesExternalTextField;
	
	/****MISCELLANEOUS****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Miscellaneous' AND visible == 1")
	public IOSElement miscellaneousHeader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Miscellaneous Type' AND visible == 1")
	public IOSElement miscellaneousTypeLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Age Contingency' AND visible == 1")
	public IOSElement ageContingencyLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Age Contingency'] and @visible = true]")
	public IOSElement ageContingencyYearText;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Age Contingency'] and @visible = true]")
	public IOSElement ageContingencyTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Septic Repair Estimate' AND visible == 1")
	public IOSElement septicRepairEstimateLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Septic Repair Estimate'] and @visible = true]")
	public IOSElement septicRepairEstimateTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Dumpster' AND visible == 1")
	public IOSElement dumpsterLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Dumpster'] and @visible = true]")
	public IOSElement dumpsterTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Truck Load of Debris' AND visible == 1")
	public IOSElement truckLoadDebrisLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Truck Load of Debris'] and @visible = true]")
	public IOSElement truckLoadDebrisTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Fencing' AND visible == 1")
	public IOSElement fencingLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Fencing'] and @visible = true]")
	public IOSElement fencingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Permits' AND visible == 1")
	public IOSElement permitsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Permits'] and @visible = true]")
	public IOSElement permitsCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Permits'] and @visible = true]")
	public IOSElement permitsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Driveway/Sidewalk' AND visible == 1")
	public IOSElement drivewaySidewalkLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Driveway/Sidewalk'] and @visible = true]")
	public IOSElement drivewaySidewalkCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Driveway/Sidewalk'] and @visible = true]")
	public IOSElement drivewaySidewalkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Landscaping' AND visible == 1")
	public IOSElement landscapingLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name = 'Landscaping'] and @visible = true]")
	public IOSElement landscapingCheckBox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Landscaping'] and @visible = true]")
	public IOSElement landscapingTextField;
	
/***************************************************/	
	
		
	public boolean percentageChange(String direction){
		try{
			JavascriptExecutor js = driver;
		    Map<String, Object> params = new HashMap<String, Object>();
		    params.put("order", direction);
		    params.put("offset", 0.10);
		    params.put("element", percentage.getId());
		    js.executeScript("mobile: selectPickerWheelValue", params);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Repairs, in method - percentageChange :"+e);
			return false;
		}
	}
	
	/*
	public void swipe(IOSElement element , String direction){
	
	try{	
		boolean a = false;
		IOSTouchAction ac = new IOSTouchAction(driver);
		while(a == false){
			try{
				if(element.getAttribute("visible").equals("true")){
					int y = element.getLocation().getY();
					if(y > 740){
						ac.longPress(280, 560).moveTo(280, 530).release().perform();
					}
					else if(y < 100){
						ac.longPress(280, 530).moveTo(280, 560).release().perform();
					}
					a = true;
				}
				else{
					throw new Exception("");
				}
				
			}
			catch(Exception e){
				JavascriptExecutor js = driver;
			    HashMap<String, String> swipeObject = new HashMap<String, String>();
			    swipeObject.put("direction", direction);
			    js.executeScript("mobile: swipe", swipeObject);
			}
		}
	}
	catch(Exception e){
		System.err.println("Exception in class - Property_Repairs, in method - swipe :"+e);
	}
		
	}
	*/
	
	public boolean pricingProfileFeatures(ArrayList<String> input , ArrayList<String> desiredOutput , String work, String current, IOSElement banner){
	
	try{
			
		ArrayList<String> checkDuplicate = new ArrayList<String>();
		IOSElement ref = pricingProfileElementLabel;
		int x = banner.getLocation().getX();
		int y = ref.getLocation().getY();
		int h = ref.getRect().getHeight();
		int k = 0;
		boolean a = false , res = true;
		IOSElement next = null;
		while(a == false){
			try{
		
				if((y+h) > 740){
					JavascriptExecutor js = driver;
				    HashMap<String, String> swipeObject = new HashMap<String, String>();
				    swipeObject.put("direction", "up");
				    js.executeScript("mobile: swipe", swipeObject);	
				}
				y = ref.getLocation().getY();
				h = ref.getRect().getHeight();
				next = (IOSElement) driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.x == "+x+" AND rect.y > "+y+" AND visible == 1"));
				if(next.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND name == 'Added Features'")).getAttribute("visible").equals("true")){
					a = true;
					
				}
				else{
					throw new Exception("");
				}
			}
			catch(Exception e){
				String nextId = next.getId();
				if(!checkDuplicate.contains(nextId)){
					checkDuplicate.add(nextId);	
					List<MobileElement> textView = next.findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextView'"));
					for(int i = 0 ; i < textView.size() ; i++){
						if(work.equals("set")){
							if(textView.get(i).getAttribute("value")==null){
								textView.get(i).click();
								driver.getKeyboard().sendKeys(input.get(k));
								driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
								try{
									driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == '"+desiredOutput.get(k)+"'"));
									k++;
								}
								catch(Exception l){
									res = false;
									k++;
								}
							}
						}
							else if(work.equals("edit")){
								if(textView.get(i).getAttribute("value").equals(current)){
									textView.get(i).clear();
									driver.getKeyboard().sendKeys(input.get(k));
									driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
									try{
										driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == '"+desiredOutput.get(k)+"'"));
										k++;
									}
									catch(Exception l){
										res = false;
										k++;
									}

							}
					}
				}
				ref = next;
			}			
		}
		}
		return res;
	}	
	  catch(Exception f){
		System.err.println("Exception in class - Property_Repairs, in method - pricingProfileFeatures :"+f);
		return false;
		}
	}
	
	public boolean addedFeatures(IOSElement banner,String some, ArrayList<String> input, int rowNum,ArrayList<String> output){
		
		try{
		
		ArrayList<String> checkDuplicate = new ArrayList<String>();
		IOSElement ref = pricingProfileElementLabel;
		int x = banner.getLocation().getX();
		int y = ref.getLocation().getY();
		int h = ref.getRect().getHeight();
		int k = 0 , l = 0;
		boolean a = false , res = false;
		IOSElement next = null;
		int count = 0;
		
		while(a == false){
			try{
				if((y+h) > 740){
					JavascriptExecutor js = driver;
				    HashMap<String, String> swipeObject = new HashMap<String, String>();
				    swipeObject.put("direction", "up");
				    js.executeScript("mobile: swipe", swipeObject);	
				}
				y = ref.getLocation().getY();
				h = ref.getRect().getHeight();
				next = (IOSElement) driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.x == "+x+" AND rect.y > "+y+" AND visible == 1"));
				if(next.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Add Feature'")).getAttribute("visible").equals("true")){
					a = true;
					
				}
				else{
					throw new Exception("");
				}
			}
			catch(Exception e){
				String nextId = next.getId();
				if(!checkDuplicate.contains(nextId)){
					checkDuplicate.add(nextId);	
					List<MobileElement> textView = next.findElements(By.className("XCUIElementTypeTextView"));
					MobileElement remove = next.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'iconsDelete'"));
					MobileElement measure = next.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND rect.width > 40"));
					count++;
					if(some.equals("addToRow")){
						if(rowNum == count){
							for(int i = 0 ; i < textView.size() ; i++){
								textView.get(i).click();
								driver.getKeyboard().sendKeys(input.get(k));
								k++;
								driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
							}
							measure.click();
							if(!input.get(k).equals("")){
								driver.findElement(By.name(input.get(k))).click();
								k++;
							}
							else{
								measure.click();
							}
							List<MobileElement> text = next.findElements(By.className("XCUIElementTypeStaticText"));
							for(int i = 0 ; i < text.size() ; i++){
								if(text.get(i).getAttribute("name").equals(output.get(l))){
									res = true;
									break;
								}
							}
							l++;
						}
					}
					else if(some.equals("addContinous")){
						for(int i = 0 ; i < textView.size() ; i++){
							textView.get(i).click();
							driver.getKeyboard().sendKeys(input.get(k));
							k++;
							driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
						}
						measure.click();
						if(!input.get(k).equals("")){
							driver.findElement(By.name(input.get(k))).click();
							k++;
						}
						else{
							measure.click();
						}
						List<MobileElement> text = next.findElements(By.className("XCUIElementTypeStaticText"));
						for(int i = 0 ; i < text.size() ; i++){
							if(text.get(i).getAttribute("name").equals(output.get(l))){
								res = true;
								break;
							}
						}
						l++;
					}
					else if(some.equals("edit")){
						if(rowNum == count){
							for(int i = 0 ; i < textView.size() ; i++){
								textView.get(i).clear();
								driver.getKeyboard().sendKeys(input.get(k));
								k++;
								driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
							}
							if(!input.get(k).equals("")){
								measure.click();
								driver.findElement(By.name(input.get(k))).click();
								k++;
							}
							List<MobileElement> text = next.findElements(By.className("XCUIElementTypeStaticText"));
							for(int i = 0 ; i < text.size() ; i++){
								if(text.get(i).getAttribute("name").equals(output.get(l))){
									res = true;
									break;
								}
							}
							l++;
						}
					}
					else if(some.equals("remove")){
						 if(rowNum == count){
							 remove.click();
						 }
					}
				}
			}
		}
		return res;
		}
		catch(Exception q){
			System.err.println("Exception in class - Property_Repairs, in method - addedFeatures :"+q);
			return false;
		}
	}
	
	
	
}
