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
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

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
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Roofing'$]/XCUIElementTypeStaticText[2]")
	public IOSElement roofingPrice;
	
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

	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace All'$]/XCUIElementTypeButton[1]")
	public IOSElement replaceAllCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace All'$]/XCUIElementTypeButton[2]")
	public IOSElement repairCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Estimate' AND visible == 1")
	public IOSElement estimateLabel;

	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Estimate'$]/XCUIElementTypeTextField")
	public IOSElement estimateTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Re-Deck' AND visible == 1")
	public IOSElement reDeckLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Re-Deck'$]/XCUIElementTypeButton")
	public IOSElement reDeckCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Paint Tile Roof' AND visible == 1")
	public IOSElement paintTileRoofLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint Tile Roof'$]/XCUIElementTypeButton")
	public IOSElement paintTileRoofCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Roof Information' AND visible == 1")
	public IOSElement roofInformationLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Roof Pitch' AND visible == 1")
	public IOSElement roofPitchLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Roof Pitch'$]/XCUIElementTypeTextField")
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
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Roofing Material'$]/XCUIElementTypeButton")
	public IOSElement roofingMaterialDropDown;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Current Number of Layers' AND visible == 1")
	public IOSElement currentNumberOfLayersLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Current Number of Layers'$]/XCUIElementTypeTextField")
	public IOSElement currentNumberOfLayersTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Soffit' AND visible == 1")
	public IOSElement soffitLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Soffit'$]/XCUIElementTypeTextField")
	public IOSElement soffitTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Gutters' AND visible == 1")
	public IOSElement guttersLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Gutters'$]/XCUIElementTypeTextField")
	public IOSElement guttersTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Pricing Profile Features' AND visible == 1")
	public IOSElement pricingProfileElementLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Added Features'")
	public IOSElement addedFeaturesLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Add Feature'")
	public IOSElement addFeatureButton;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'iconsDelete' AND visible == 1")
	public IOSElement deleteAddFeatureBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$type == 'XCUIElementTypeButton' AND name == 'iconsDelete'$]")
	public ArrayList<IOSElement> additionalFeaturesCell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Custom Estimate' AND visible == 1")
	public IOSElement customEstimateLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Custom Estimate'$]/XCUIElementTypeTextField")
	public IOSElement customEstimateTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Notes' AND visible == 1")
	public IOSElement notesLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Notes'$]/XCUIElementTypeTextField")
	public IOSElement notesTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND visible == 1 AND name CONTAINS 'out of 160 characters'")
	public IOSElement notesCharacter;
	
	/****DOORS & WINDOWS*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Doors & Windows' AND visible == 1")
	public IOSElement doorAndWindowsHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Doors & Windows'$]/XCUIElementTypeStaticText[2]")
	public IOSElement doorAndWindowsPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Doors' AND visible == 1")
	public IOSElement doorsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Entry Door' AND visible == 1")
	public IOSElement entryDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Entry Door'$]/XCUIElementTypeTextField[1]")
	public IOSElement entryDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Sliding Patio Glass' AND visible == 1")
	public IOSElement slidingPatioGlassLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Sliding Patio Glass'$]/XCUIElementTypeTextField[2]")
	public IOSElement slidingPatioGlassTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Service Door' AND visible == 1")
	public IOSElement serviceDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Service Door'$]/XCUIElementTypeTextField[1]")
	public IOSElement serviceDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Vinyl Sliding Patio Door' AND visible == 1")
	public IOSElement vinylSlidingPatioDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Vinyl Sliding Patio Door'$]/XCUIElementTypeTextField[2]")
	public IOSElement vinylSlidingPatioTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Screen Door' AND visible == 1")
	public IOSElement screenDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Screen Door'$]/XCUIElementTypeTextField[1]")
	public IOSElement screenDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wood Sliding Patio Door' AND visible == 1")
	public IOSElement woodSlidingPatioDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Wood Sliding Patio Door'$]/XCUIElementTypeTextField[2]")
	public IOSElement woodSlidingPatioDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Interior Door' AND visible == 1")
	public IOSElement interiorDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Interior Door'$]/XCUIElementTypeTextField[1]")
	public IOSElement interiorDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'French Door' AND visible == 1")
	public IOSElement frenchDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'French Door'$]/XCUIElementTypeTextField[2]")
	public IOSElement frenchDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Door and Base Trim' AND visible == 1")
	public IOSElement doorAndBaseTrimLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Door and Base Trim'$]/XCUIElementTypeTextField[1]")
	public IOSElement doorAndBaseTrimTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Single Garage Door' AND visible == 1")
	public IOSElement singleGarageDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Single Garage Door'$]/XCUIElementTypeTextField[2]")
	public IOSElement singleGarageDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Door Jamb' AND visible == 1")
	public IOSElement doorJambLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Door Jamb'$]/XCUIElementTypeTextField[1]")
	public IOSElement doorJambTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Double Garage Door' AND visible == 1")
	public IOSElement doubleGarageDoorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Double Garage Door'$]/XCUIElementTypeTextField[2]")
	public IOSElement doubleGarageDoorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Door Knobs in House' AND visible == 1")
	public IOSElement replaceDoorKnobsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Door Knobs in House'$]/XCUIElementTypeButton")
	public IOSElement doubleGarageDoorCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Windows' AND visible == 1")
	public IOSElement windowsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Windows Type' AND visible == 1")
	public IOSElement windowsTypeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Windows Type'$]/XCUIElementTypeButton")
	public IOSElement windowTypeDropDown;
	
		/*****WINDOWS TYPES DROPDOWN**/
	
		@iOSXCUITFindBy(accessibility="Vinyl")
		public IOSElement vinyl;
	
		@iOSXCUITFindBy(accessibility="Wood")
		public IOSElement wood;
	
		/**********/
	
	@iOSXCUITFindBy(accessibility="Windows")
	public IOSElement windowsTextFLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Windows'$]/XCUIElementTypeTextField[1]")
	public IOSElement windowsSmallTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Windows'$]/XCUIElementTypeTextField[2]")
	public IOSElement windowsMediumTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Windows'$]/XCUIElementTypeTextField[3]")
	public IOSElement windowsLargeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Glass' AND visible == 1")
	public IOSElement glassLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Glass'$]/XCUIElementTypeTextField[1]")
	public IOSElement glassSmallTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Glass'$]/XCUIElementTypeTextField[2]")
	public IOSElement glassMediumTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Glass'$]/XCUIElementTypeTextField[3]")
	public IOSElement glassLargeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wrap Outside Window' AND visible == 1")
	public IOSElement wrapOutsideWindowLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Wrap Outside Window'$]/XCUIElementTypeButton")
	public IOSElement wrapOutsideCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Number of Windows' AND visible == 1")
	public IOSElement numberOfWindowsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Number of Windows'$]/XCUIElementTypeTextField")
	public IOSElement numberOfWindowsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Blinds in House' AND visible == 1")
	public IOSElement replaceBlindsInHouseLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Blinds in House'$]/XCUIElementTypeButton")
	public IOSElement replaceBindsCheckBox;
	
	/********EXTERIOR PAINT & SIDING******/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Exterior Paint & Siding' AND visible == 1")
	public IOSElement exteriorPaintAndSidingHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Exterior Paint & Siding'$]/XCUIElementTypeStaticText[2]")
	public IOSElement exteriorPaintAndSidingPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Paint' AND visible == 1")
	public IOSElement paintLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint'$]/XCUIElementTypeButton[1]")
	public IOSElement paintCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Siding' AND visible == 1")
	public IOSElement sidingLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint'$]/XCUIElementTypeButton[2]")
	public IOSElement sidingCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Percentage of Exterior to be Painted' AND visible == 1")
	public IOSElement percentageExteriorToPaintLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Percentage of Exterior to be Painted'$]/XCUIElementTypeTextField")
	public IOSElement percentageExteriorToPaintTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Include Soffit' AND visible == 1")
	public IOSElement includeSoffitLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Include Soffit'$]/XCUIElementTypeButton")
	public IOSElement includeSoffitCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Siding with Vinyl Siding' AND visible == 1")
	public IOSElement replaceSidingWithVinylLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Siding with Vinyl Siding'$]/XCUIElementTypeButton[1]")
	public IOSElement replaceSidingWithVinylCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Siding with Fiber Cement Board' AND visible == 1")
	public IOSElement replaceSidingWithFiberLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Siding with Vinyl Siding'$]/XCUIElementTypeButton[2]")
	public IOSElement replaceSidingWithFiberCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Percentage of Exterior to be Power Washed' AND visible == 1")
	public IOSElement percentageExteriorPowerWashedLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Percentage of Exterior to be Power Washed'$]/XCUIElementTypeTextField")
	public IOSElement percentageExteriorPowerWashedTextField;
	
	/******FOUNDATION*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Foundation' AND visible == 1")
	public IOSElement foundationHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Foundation'$]/XCUIElementTypeStaticText[2]")
	public IOSElement foundationPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Foundation Type' AND visible == 1")
	public IOSElement foundationTypeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Soffit'$]/XCUIElementTypeTextField")
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
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Complete Foundation Repair'$]/XCUIElementTypeButton[1]")
	public IOSElement completeFoundationRepairCheckBox;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Piers' AND visible == 1")
	public IOSElement replacePiersLabel;	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Complete Foundation Repair'$]/XCUIElementTypeButton[2]")
	public IOSElement replacePiersCheckBox;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Pegging' AND visible == 1")
	public IOSElement peggingLabel;	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Pegging'$]/XCUIElementTypeButton")
	public IOSElement peggingCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Basement' AND visible == 1")
	public IOSElement basementLabel;	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Basement'$]/XCUIElementTypeButton[1]")
	public IOSElement basementCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Through Floor Post' AND visible == 1")
	public IOSElement throughFloorPostLabel;	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Through Floor Post'$]/XCUIElementTypeButton[1]")
	public IOSElement throughFloorPostCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Number of Piers'$]/XCUIElementTypeTextField")
	public IOSElement numberOfPiersTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Basement Repairs'$]/XCUIElementTypeTextField")
	public IOSElement basementRepairTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Basement Finish Out'$]/XCUIElementTypeTextField")
	public IOSElement basementFinishOutTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Waterproof Basement'$]/XCUIElementTypeButton[2]")
	public IOSElement waterproofBasementTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Crawl Space'$]/XCUIElementTypeButton")
	public IOSElement crawlSpaceDropdown;
	
		/*****FOUNDATION TYPE DROPDOWN*****/
	
		@iOSXCUITFindBy(accessibility="< 4 inc")
		public IOSElement lessThanFour;
	
		@iOSXCUITFindBy(accessibility="4-12 inc")
		public IOSElement fourToTwelve;
	
		@iOSXCUITFindBy(accessibility="> 12 in")
		public IOSElement greaterThanTwelve;
	
		/*******/
		
	
	/****EXTERNAL/FUNCTIONAL OBSOLESCENCE****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'External/Functional Obsolescence' AND visible == 1")
	public IOSElement externalFunctionalObsolescenceHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'External/Functional Obsolescence'$]/XCUIElementTypeStaticText[2]")
	public IOSElement externalFunctionalObsolescencePrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Very busy street' AND visible == 1")
	public IOSElement veryBusyLabel;	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Very busy street'$]/XCUIElementTypeButton")
	public IOSElement veryBusyCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Very busy street'$]/XCUIElementTypeImage")
	public IOSElement veryBusyDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Very busy street'$]/XCUIElementTypeStaticText[2]")
	public IOSElement veryBusyCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'High tension lines next to house' AND visible == 1")
	public IOSElement highTensionLinesLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'High tension lines next to house'$]/XCUIElementTypeButton")
	public IOSElement highTensionLinesCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'High tension lines next to house'$]/XCUIElementTypeImage")
	public IOSElement highTensionLinesDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'High tension lines next to house'$]/XCUIElementTypeStaticText[2]")
	public IOSElement highTensionLinesCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Commercial property next door' AND visible == 1")
	public IOSElement commercialPropertyLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Commercial property next door'$]/XCUIElementTypeButton")
	public IOSElement commercialPropertyCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Commercial property next door'$]/XCUIElementTypeImage")
	public IOSElement commercialPropertyDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Commercial property next door'$]/XCUIElementTypeStaticText[2]")
	public IOSElement commercialPropertyCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Apartment near by' AND visible == 1")
	public IOSElement apartmentNearLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Apartment near by'$]/XCUIElementTypeButton")
	public IOSElement apartmentNearCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Apartment near by'$]/XCUIElementTypeImage")
	public IOSElement apartmentNearDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Apartment near by'$]/XCUIElementTypeStaticText[2]")
	public IOSElement apartmentNearCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Previously known flooding' AND visible == 1")
	public IOSElement previouslyKnownLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Previously known flooding'$]/XCUIElementTypeButton")
	public IOSElement previouslyKnownCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Previously known flooding'$]/XCUIElementTypeImage")
	public IOSElement previouslyKnownDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Previously known flooding'$]/XCUIElementTypeStaticText[2]")
	public IOSElement previouslyKnownCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Poor flood plan' AND visible == 1")
	public IOSElement poorFloodLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Poor flood plan'$]/XCUIElementTypeButton")
	public IOSElement poorFloodCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Poor flood plan'$]/XCUIElementTypeImage")
	public IOSElement poorFloodDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Poor flood plan'$]/XCUIElementTypeStaticText[2]")
	public IOSElement poorFloodCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Septic tanks installed where surrounding have city sewer' AND visible == 1")
	public IOSElement septicTanksLabel;

	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Septic tanks installed where surrounding have city sewer'$]/XCUIElementTypeButton")
	public IOSElement septicTanksCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Septic tanks installed where surrounding have city sewer'$]/XCUIElementTypeImage")
	public IOSElement septicTanksDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Septic tanks installed where surrounding have city sewer'$]/XCUIElementTypeStaticText[2]")
	public IOSElement septicTanksCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Lower than the typical pitched roof camps' AND visible == 1")
	public IOSElement lowerThanTheTypicalLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Lower than the typical pitched roof camps'$]/XCUIElementTypeButton")
	public IOSElement lowerThanTheTypicalCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Lower than the typical pitched roof camps'$]/XCUIElementTypeImage")
	public IOSElement lowerThanTheTypicalDropDown;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Lower than the typical pitched roof camps'$]/XCUIElementTypeStaticText[2]")
	public IOSElement lowerThanTheTypicalCost;
	
	@iOSXCUITBy(className="XCUIElementTypePickerWheel")
	public IOSElement percentage;
	
	/*****KITCHEN*****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Kitchen' AND visible == 1")
	public IOSElement kitchenHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Kitchen'$]/XCUIElementTypeStaticText[2]")
	public IOSElement kitchenPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Cabinets' AND visible == 1")
	public IOSElement cabinetsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace' AND visible == 1")
	public IOSElement replaceLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Upgrade' AND visible == 1")
	public IOSElement upgradeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint'$]/XCUIElementTypeButton[1]")
	public IOSElement replaceCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint'$]/XCUIElementTypeButton[2]")
	public IOSElement upgradeCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Paint'$]/XCUIElementTypeButton[3]")
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
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Dishwasher'$]/XCUIElementTypeTextField[1]")
	public IOSElement dishwasherTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Range Hood' AND visible == 1")
	public IOSElement rangeHoodLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Dishwasher'$]/XCUIElementTypeTextField[2]")
	public IOSElement rangeHoodTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Refrigerator' AND visible == 1")
	public IOSElement refrigeratorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Refrigerator'$]/XCUIElementTypeTextField[1]")
	public IOSElement refrigeratorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Stove Top' AND visible == 1")
	public IOSElement stoveTopLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Stove Top'$]/XCUIElementTypeTextField[2]")
	public IOSElement stoveTopTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Kitchen Sink' AND visible == 1")
	public IOSElement kitchenSinkLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Kitchen Sink'$]/XCUIElementTypeTextField[1]")
	public IOSElement kitchenSinkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Microwave' AND visible == 1")
	public IOSElement microwaveLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Microwave'$]/XCUIElementTypeTextField[2]")
	public IOSElement microwaveTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Range' AND visible == 1")
	public IOSElement rangeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Range'$]/XCUIElementTypeTextField[1]")
	public IOSElement rangeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Garbage Disposal' AND visible == 1")
	public IOSElement garbageDisposalLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Garbage Disposal'$]/XCUIElementTypeTextField[2]")
	public IOSElement garbageDiposalTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Linear Feet' AND visible == 1")
	public IOSElement linearFeatLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Linear Feat'$]/XCUIElementTypeTextField")
	public IOSElement LinearFeatTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Stainless Steel Surcharge' AND visible == 1")
	public IOSElement stainlessSteelSurchargeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Stainless Steel Surcharge'$]/XCUIElementTypeButton")
	public IOSElement stainlessSteelSurchargeCheckBox;
	
	/****BATHROOM****/	
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Bathroom' AND visible == 1")
	public IOSElement bathroomHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Bathroom'$]/XCUIElementTypeStaticText[2]")
	public IOSElement bathroomPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Vanity' AND visible == 1")
	public IOSElement vanityLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Vanity'$]/XCUIElementTypeTextField[1]")
	public IOSElement vanityTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Kit' AND visible == 1")
	public IOSElement showerKitLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Shower Kit'$]/XCUIElementTypeTextField[2]")
	public IOSElement showerKitTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Sink' AND visible == 1")
	public IOSElement sinkLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Sink'$]/XCUIElementTypeTextField[1]")
	public IOSElement sinkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Pan' AND visible == 1")
	public IOSElement showerPanLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Shower Pan'$]/XCUIElementTypeTextField[2]")
	public IOSElement showerPanTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Toilet' AND visible == 1")
	public IOSElement toiletLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Toilet'$]/XCUIElementTypeTextField[1]")
	public IOSElement toiletTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Shower Stall Tile' AND visible == 1")
	public IOSElement showerStallTileLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Shower Stall Tile'$]/XCUIElementTypeTextField[2]")
	public IOSElement showerStallTileTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tub' AND visible == 1")
	public IOSElement tubLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Tub'$]/XCUIElementTypeTextField[1]")
	public IOSElement tubTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Full Wall Tile' AND visible == 1")
	public IOSElement fullWallTileLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Full Wall Tile'$]/XCUIElementTypeTextField[2]")
	public IOSElement fullWallTileTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tile Around Tub' AND visible == 1")
	public IOSElement tileAroundTubLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Tile Around Tub'$]/XCUIElementTypeTextField[2]")
	public IOSElement tileAroundTubTextField;
	
	/****INTERIOR PAINT****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Interior Paint' AND visible == 1")
	public IOSElement interiorPaintHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Interior Paint'$]/XCUIElementTypeStaticText[2]")
	public IOSElement interiorPaintPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'All Interior' AND visible == 1")
	public IOSElement allInteriorLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Closet Doors' AND visible == 1")
	public IOSElement closetDoorsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'All Interior'$]/XCUIElementTypeButton[1]")
	public IOSElement allInteriorCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'All Interior'$]/XCUIElementTypeButton[2]")
	public IOSElement doorsCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'All Interior'$]/XCUIElementTypeButton[3]")
	public IOSElement closetDoorsCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Trim' AND visible == 1")
	public IOSElement trimLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Wood Window' AND visible == 1")
	public IOSElement woodWindowLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Trim'$]/XCUIElementTypeButton[1]")
	public IOSElement woodWindowCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Trim'$]/XCUIElementTypeButton[2]")
	public IOSElement trimCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Ceilings' AND visible == 1")
	public IOSElement ceilingsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Ceilings'$]/XCUIElementTypeButton")
	public IOSElement ceilingCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Ceilings'$]/XCUIElementTypeTextField")
	public IOSElement ceilingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Walls' AND visible == 1")
	public IOSElement wallsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Walls'$]/XCUIElementTypeButton")
	public IOSElement wallsCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Walls'$]/XCUIElementTypeTextField")
	public IOSElement wallsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Remove Popcorn Ceiling' AND visible == 1")
	public IOSElement removePopcornCeilingLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Remove Popcorn Ceiling'$]/XCUIElementTypeButton")
	public IOSElement removePopcornCeilingCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Remove Popcorn Ceiling'$]/XCUIElementTypeTextField")
	public IOSElement removePopcornCeilingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Drywall' AND visible == 1")
	public IOSElement dryWallLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Whole House' AND visible == 1")
	public IOSElement replaceWholeHouseLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Repair a Selection' AND visible == 1")
	public IOSElement repairASelectionLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Whole House'$]/XCUIElementTypeButton[1]")
	public IOSElement replaceWholeHouseCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Whole House'$]/XCUIElementTypeButton[2]")
	public IOSElement repairASelectionCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Number of Rooms to Repair' AND visible == 1")
	public IOSElement numberofRoomToRepairLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Number of Rooms to Repair'$]/XCUIElementTypeTextField")
	public IOSElement numberofRoomToRepairTextField;
	
	/*****FLOORING****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Flooring' AND visible == 1")
	public IOSElement flooringHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Flooring'$]/XCUIElementTypeStaticText[2]")
	public IOSElement flooringPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Enter the percentage of flooring to be replaced, percentage does not need to add up to 100.' AND visible == 1")
	public IOSElement enterPercentageLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Tile/Laminate' AND visible == 1")
	public IOSElement tileLaminateLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Tile/Laminate'$]/XCUIElementTypeTextField")
	public IOSElement tileLaminateTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Tile/Laminate'$]/XCUIElementTypeStaticText[2]")
	public IOSElement tileResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'New Hardwood' AND visible == 1")
	public IOSElement newHardwoodLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'New Hardwood'$]/XCUIElementTypeTextField")
	public IOSElement newHardwoodTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'New Hardwood'$]/XCUIElementTypeStaticText[2]")
	public IOSElement newHardwoodResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Refinish Hardwood' AND visible == 1")
	public IOSElement refinishHardwoodLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Refinish Hardwood'$]/XCUIElementTypeTextField")
	public IOSElement refinishHardwoodTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Refinish Hardwood'$]/XCUIElementTypeStaticText[2]")
	public IOSElement refinishHardwoodResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Carpet' AND visible == 1")
	public IOSElement carpetLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Carpet'$]/XCUIElementTypeTextField")
	public IOSElement carpetTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Carpet'$]/XCUIElementTypeStaticText[2]")
	public IOSElement carpetResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Linoleum' AND visible == 1")
	public IOSElement linoleumLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Linoleum'$]/XCUIElementTypeTextField")
	public IOSElement linoleumTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Linoleum'$]/XCUIElementTypeStaticText[2]")
	public IOSElement linoleumResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Total to be Repaired' AND visible == 1")
	public IOSElement totalToBeRepairedLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Total to be Repaired'$]/XCUIElementTypeStaticText[1]")
	public IOSElement totalToBeRepairedPercentage;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Total to be Repaired'$]/XCUIElementTypeStaticText[2]")
	public IOSElement totalToBeRepairedResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Total not Repaired' AND visible == 1")
	public IOSElement totalNotRepairedLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Total not Repaired'$]/XCUIElementTypeStaticText[1]")
	public IOSElement totalNotRepairedPercentage;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Total not Repaired'$]/XCUIElementTypeStaticText[2]")
	public IOSElement totalNotRepairedResult;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Baseboard Trim' AND visible == 1")
	public IOSElement baseboardLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Baseboard Trim'$]/XCUIElementTypeButton")
	public IOSElement baseboardCheckBox;
	
	/****PLUMBING****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Plumbing' AND visible == 1")
	public IOSElement plumbingHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Plumbing'$]/XCUIElementTypeStaticText[2]")
	public IOSElement plumbingPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replumb House' AND visible == 1")
	public IOSElement replumbHouseLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replumb House'$]/XCUIElementTypeButton[1]")
	public IOSElement replumbHouseCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Hot Water Tank' AND visible == 1")
	public IOSElement hotWaterTankLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replumb House'$]/XCUIElementTypeButton[2]")
	public IOSElement hotWaterTankCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Gas' AND visible == 1")
	public IOSElement gasLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Gas'$]/XCUIElementTypeButton[1]")
	public IOSElement gasCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Electric' AND visible == 1")
	public IOSElement electricLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Gas'$]/XCUIElementTypeButton[2]")
	public IOSElement electricCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Plumbing Fixtures' AND visible == 1")
	public IOSElement replacePlumbingFixturesLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Plumbing Fixtures'$]/XCUIElementTypeButton[1]")
	public IOSElement replacePlumbingFixturesCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Septic Tank' AND visible == 1")
	public IOSElement replaceSepticTankLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Plumbing Fixtures'$]/XCUIElementTypeButton[2]")
	public IOSElement replaceSepticTankCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Town Sewer Tie-In' AND visible == 1")
	public IOSElement townSewerLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Plumbing Fixtures'$]/XCUIElementTypeButton[3]")
	public IOSElement townSewerCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Non Conforming Lot/Off Season' AND visible == 1")
	public IOSElement nonConformingLotLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Non Conforming Lot/Off Season'$]/XCUIElementTypeButton")
	public IOSElement nonConformingLotCheckBox;
	
	/****HVAC****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'HVAC' AND visible == 1")
	public IOSElement hVACHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'HVAC'$]/XCUIElementTypeStaticText[2]")
	public IOSElement hVACPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Cleaning and Service' AND visible == 1")
	public IOSElement cleaningAndServiceLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Cleaning and Service'$]/XCUIElementTypeButton[1]")
	public IOSElement cleaningAndServiceCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Cleaning and Service'$]/XCUIElementTypeButton[2]")
	public IOSElement replaceAllHVACCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Insulation' AND visible == 1")
	public IOSElement insulationLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace Insulation' AND visible == 1")
	public IOSElement replaceInsulationLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Replace Insulation'$]/XCUIElementTypeButton")
	public IOSElement replaceInsulationCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Walls'$]/XCUIElementTypeButton[1]")
	public IOSElement wallsHVACCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Ceilings'$]/XCUIElementTypeButton[2]")
	public IOSElement ceilingsHVACCheckBox;
	
	/****ELECTRICAL****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Electrical' AND visible == 1")
	public IOSElement electricalHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Electrical'$]/XCUIElementTypeStaticText[2]")
	public IOSElement electricalPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Rewire Entire House' AND visible == 1")
	public IOSElement rewireEntireHouseLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Rewire Entire House'$]/XCUIElementTypeButton")
	public IOSElement rewireEntireHouseCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Other Repairs' AND visible == 1")
	public IOSElement otherRepairsLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Select all that apply' AND visible == 1")
	public IOSElement selectAllThatApplyLabel;

	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Service Upgrade' AND visible == 1")
	public IOSElement serviceUpgradeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Service Upgrade'$]/XCUIElementTypeButton[1]")
	public IOSElement serviceUpgradeCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Replace All Switches and Outlets' AND visible == 1")
	public IOSElement replaceAllSwitchesLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Service Upgrade'$]/XCUIElementTypeButton[2]")
	public IOSElement replaceAllSwitchesCheckBox;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Smoke Detector' AND visible == 1")
	public IOSElement smokeDetectorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Smoke Detector'$]/XCUIElementTypeTextField[1]")
	public IOSElement smokeDetectorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'CO Detector' AND visible == 1")
	public IOSElement coDetectorLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Smoke Detector'$]/XCUIElementTypeTextField[2]")
	public IOSElement coDetectorTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'GFI' AND visible == 1")
	public IOSElement gfiLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'GFI'$]/XCUIElementTypeTextField")
	public IOSElement gfiTextField;
	
	/****FIXTURES****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Fixtures' AND visible == 1")
	public IOSElement fixturesHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Fixtures'$]/XCUIElementTypeStaticText[2]")
	public IOSElement fixturesPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Internal' AND visible == 1")
	public IOSElement internalLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Fans' AND visible == 1")
	public IOSElement fanLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Fans'$]/XCUIElementTypeTextField[1]")
	public IOSElement fansTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Fans'$]/XCUIElementTypeStaticText[2]")
	public IOSElement lightingFixturesInternalLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Fans'$]/XCUIElementTypeTextField[2]")
	public IOSElement lightingFixturesInternalTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'External' AND visible == 1")
	public IOSElement externalLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'External'$]/XCUIElementTypeTextField")
	public IOSElement lightingFixturesExternalTextField;
	
	/****MISCELLANEOUS****/
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'Miscellaneous' AND visible == 1")
	public IOSElement miscellaneousHeader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/**/XCUIElementTypeOther[`visible == 1`][$name == 'Miscellaneous'$]/XCUIElementTypeStaticText[2]")
	public IOSElement miscellaneousPrice;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Miscellaneous Type' AND visible == 1")
	public IOSElement miscellaneousTypeLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Age Contingency' AND visible == 1")
	public IOSElement ageContingencyLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Age Contingency'$]/XCUIElementTypeStaticText[2]")
	public IOSElement ageContingencyYearText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Age Contingency'$]/XCUIElementTypeTextField")
	public IOSElement ageContingencyTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Septic Repair Estimate' AND visible == 1")
	public IOSElement septicRepairEstimateLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Septic Repair Estimate'$]/XCUIElementTypeTextField")
	public IOSElement septicRepairEstimateTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Dumpster' AND visible == 1")
	public IOSElement dumpsterLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Dumpster'$]/XCUIElementTypeTextField")
	public IOSElement dumpsterTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Truck Load of Debris' AND visible == 1")
	public IOSElement truckLoadDebrisLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Truck Load of Debris'$]/XCUIElementTypeTextField")
	public IOSElement truckLoadDebrisTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Fencing' AND visible == 1")
	public IOSElement fencingLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Fencing'$]/XCUIElementTypeTextField")
	public IOSElement fencingTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Permits' AND visible == 1")
	public IOSElement permitsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Permits'$]/XCUIElementTypeButton")
	public IOSElement permitsCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Permits'$]/XCUIElementTypeTextField")
	public IOSElement permitsTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Driveway/Sidewalk' AND visible == 1")
	public IOSElement drivewaySidewalkLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Driveway/Sidewalk'$]/XCUIElementTypeButton")
	public IOSElement drivewaySidewalkCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Driveway/Sidewalk'$]/XCUIElementTypeTextField")
	public IOSElement drivewaySidewalkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Landscaping' AND visible == 1")
	public IOSElement landscapingLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Landscaping'$]/XCUIElementTypeButton")
	public IOSElement landscapingCheckBox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`visible == 1`][$name == 'Landscaping'$]/XCUIElementTypeTextField")
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
	//ReNotSelected
	public boolean verifyCheckBox(IOSElement element){
		try{
			String path = "src/main/resources/";
			ExtraFunctionalityCheck.getScreenshots(element);
			if((element.equals(replaceAllCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS/ReNotSelected.png")>10)){
				return true;
			}
			else if((element.equals(repairCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS/ReNotSelected.png")>10)){
				return true;
			}
			else if((element.equals(reDeckCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS/ReNotSelected.png")>10)){
				return true;
			}
			else if((element.equals(paintTileRoofCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS/PaNotSelected.png")>10)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Repairs, in method - verifyCheckBox :"+e);
			return false;
		}
	}
	
	public void swipe(IOSElement element , String direction){
	
	try{	
		boolean a = false;
		IOSTouchAction ac = new IOSTouchAction(driver);
		while(a == false){
			try{
				if(element.getAttribute("visible").equals("true")){
					int y = element.getLocation().getY();
					if(y > 740){
						ac.longPress(PointOption.point(280, 560)).moveTo(PointOption.point(280, 530)).release().perform();
					}
					else if(y < 100){
						ac.longPress(PointOption.point(280, 530)).moveTo(PointOption.point(280, 560)).release().perform();
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
	
	public boolean selectRoofingMaterial(int i){
		try{
			switch(i){
			case 1:none.click();
				break;
			case 2:threeTab.click();
				break;
			case 3:dimensional.click();
				break;
			case 4:hotTar.click();
				break;
			case 5:rollRoofing.click();
				break;
			case 6:tile.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Repairs, in method - selectRoofingMaterial :"+e);
			return false;
		}
	}
	
	
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
	/**
	 * @param banner : Heading - Roofing,Doors & Windows, Exterior Paint & Siding, Foundation, E/FO etc
	 * @param operation : addToRow, addContinous, edit, remove
	 * @param input : ArrayList consisting of all the inputs
	 * @param rowNum : not applicable for addContinous
	 * @param output : ArrayList consisting of all the outputs
	 * @return
	 */
	public boolean addedFeatures(IOSElement banner,String operation, ArrayList<String> input, int rowNum,ArrayList<String> output){
		
		try{
		
		ArrayList<String> checkDuplicate = new ArrayList<String>();
		IOSElement ref = addedFeaturesLabel;
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
					if(operation.equals("addToRow")){
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
					else if(operation.equals("addContinous")){
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
					else if(operation.equals("edit")){
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
					else if(operation.equals("remove")){
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
	
	public boolean insertAdditionalFeatures(int row, String quantity, String description, String costPerUnit, String four){
		try{
			row = row - 1;
			IOSElement cell = additionalFeaturesCell.get(row);
			List<MobileElement> text = cell.findElements(MobileBy.iOSClassChain("**/XCUIElementTypeTextView[$name == 'UITextViewView'$]"));
			IOSElement one = (IOSElement)text.get(0);
			one.click();
			one.clear();
			one.sendKeys(quantity);
			driver.hideKeyboard();
			IOSElement two = (IOSElement)text.get(1);
			two.click();
			two.clear();
			two.sendKeys(description);
			driver.hideKeyboard();
			IOSElement three = (IOSElement)text.get(2);
			three.setValue("89");
			three.clear();
			three.sendKeys(costPerUnit);
			//driver.hideKeyboard();
			IOSElement fo = (IOSElement)text.get(3);
			driver.getKeyboard();
			fo.click();
			fo.clear();
			fo.click();
			fo.click();
			fo.sendKeys(four);
			driver.hideKeyboard();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - insertAdditionalFeatures : "+e);
			return false;
		}
	}
	
	
}
