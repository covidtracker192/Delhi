package com.covid19.delhi;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Test_MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng latLng;
    private FusedLocationProviderClient fusedLocationClient;
    private SupportMapFragment mapFragment;
    LocationRequest mLocationRequest;
    Location mLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(30000);
        mLocationRequest.setFastestInterval(30000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        fusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
        mMap.setMyLocationEnabled(true);

        // Test Center 1
        final LatLng center1 = new LatLng(28.901353, 77.162082);
        mMap.addMarker(new MarkerOptions().position(center1).title("Institute of Liver and Biliary Sciences, Vasant Kunj, New Delhi").snippet("website: https://www.ilbs.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center1));

        //Test Center 2
        final LatLng center2 = new LatLng(28.951980, 77.209814);
        mMap.addMarker(new MarkerOptions().position(center2).title("Department of Microbiology, National Institute of TB and Respiratory Diseases, Mehrauli, New Delhi").snippet("website: http://www.nitrd.nic.in/Content/Viewdata.aspx?value=29"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center2));

        //Test Center 3
        final LatLng center3 = new LatLng(29.016705, 77.008274);
        mMap.addMarker(new MarkerOptions().position(center3).title("Prognosis Laboratories (PRL) (Formerly Siddhant Diagnostix), Dwarka, New Delhi").snippet("website: http://www.prlworld.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center3));

        //Test Center 4
        final LatLng center4 = new LatLng(28.837080, 77.341644);
        mMap.addMarker(new MarkerOptions().position(center4).title("Genestrings Diagnostic Centre Pvt.Ltd, Geetanjali Enclave, Sarvodaya Enclave, New Delhi").snippet("website: http://www.genestrings.co.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center4));

        //Test Center 5
        final LatLng center5 = new LatLng(28.978268, 77.118137);
        mMap.addMarker(new MarkerOptions().position(center5).title("Venkateshwar Hospital, Dwarka, New Delhi").snippet("website: https://www.venkateshwarhospitals.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center5));

        //Test Center 6
        final LatLng center6 = new LatLng(28.960095, 77.056002);
        mMap.addMarker(new MarkerOptions().position(center6).title("SRL Diagnostics, SRL,REFERENCE LAB, Gurugram, Haryana").snippet("website: https://www.srlworld.com/?utm_source=gbgurgaonsrludyogvihar&utm_medium=product&utm_campaign=offer"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(6));

        //Test Center 7
        final LatLng center7 = new LatLng(28.844680, 77.121920);
        mMap.addMarker(new MarkerOptions().position(center7).title("Apex Diagnostics, Gurugram, Haryana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center7));

        //Test Center 8
        final LatLng center8 = new LatLng(28.613466, 77.034029);
        mMap.addMarker(new MarkerOptions().position(center8).title("Pathkind Labs, Gurugram, Haryana").snippet("website: https://www.pathkindlabs.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center8));

        //Test Center 9
        final LatLng center9 = new LatLng(28.767666, 76.946139);
        mMap.addMarker(new MarkerOptions().position(center9).title("Molq Lab, Gurugram, Haryana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center9));

        //Test Center 10
        final LatLng center10 = new LatLng(28.928803, 77.165779);
        mMap.addMarker(new MarkerOptions().position(center10).title("CORE Diagnostics, Gurugram, Haryana").snippet("website: https://corediagnostics.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));

        //Test Center 11
        final LatLng center11 = new LatLng(28.950710, 77.121923);
        mMap.addMarker(new MarkerOptions().position(center11).title("Dept of Lab Medicine HCMCT, Manipal Hospital, Dwarka, New Delhi").snippet("website: https://www.manipalhospitals.com/delhi/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center11));

        //Test Center 12
        final LatLng center12 = new LatLng(28.822991, 77.316775);
        mMap.addMarker(new MarkerOptions().position(center12).title("Genx Diagnostics, Sarvapriya Vihar, New Delhi").snippet("website: http://www.genxdiagnostics.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center12));

        //Test Center 13
        final LatLng center13 = new LatLng(28.823472, 77.385591);
        mMap.addMarker(new MarkerOptions().position(center13).title("Metropolis Healthcare Ltd, Badarpur, New Delhi").snippet("website: https://www.metropolisindia.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center13));

        //Test Center 14
        final LatLng center14 = new LatLng(28.875510, 76.968026);
        mMap.addMarker(new MarkerOptions().position(center14).title("Aakash Path Lab, Sector 3, Dwarka, New Delhi").snippet("website: https://aakashhealthcare.com/lab-medicine"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center14));

        //Test Center 15
        final LatLng center15 = new LatLng(28.861566, 77.253755);
        mMap.addMarker(new MarkerOptions().position(center15).title("Dr Dangs Lab - New Delhi").snippet("website: https://www.drdangslab.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center15));

        //Test Center 16
        final LatLng center16 = new LatLng(28.832603, 77.275642);
        mMap.addMarker(new MarkerOptions().position(center16).title("Sterling Accuris Diagnostics, New Delhi").snippet("website: http://www.sterlingaccuris.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center16));

        //Test Center 17
        final LatLng center17 = new LatLng(28.890334, 77.275642);
        mMap.addMarker(new MarkerOptions().position(center17).title("LifeLine Laboratory, New Delhi").snippet("website: https://www.lifelinelaboratory.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center17));

        //Test Center 18
        final LatLng center18 = new LatLng(28.871094, 77.363532);
        mMap.addMarker(new MarkerOptions().position(center18).title("Dr P Bhasin Path Labs, New Delhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center18));

        //Test Center 19
        final LatLng center19 = new LatLng(28.940868, 77.034029);
        mMap.addMarker(new MarkerOptions().position(center19).title("Army Hospital Research And Referral, Dhaula Kuan, New Delhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center19));

        //Test Center 20
        final LatLng center20 = new LatLng(28.861966, 77.209810);
        mMap.addMarker(new MarkerOptions().position(center20).title("Laboratory Services Indraprastha Apollo Hospitals, Sarita Vihar, New Delhi").snippet("website: https://delhi.apollohospitals.com/laboratory-services"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center20));

        //Test Center 21
        final LatLng center21 = new LatLng(29.024913, 77.143806);
        mMap.addMarker(new MarkerOptions().position(center21).title("AIIMS, New Delhi").snippet("website: https://www.aiims.edu/en.html"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center21));

        //Test Center 22
        final LatLng center22 = new LatLng(28.998779, 77.203257);
        mMap.addMarker(new MarkerOptions().position(center22).title("Vardhman Mahavir Medical College & Safdarjung Hospital, New Delhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center22));

        //Test Center 23
        final LatLng center23 = new LatLng(28.813353, 77.253669);
        mMap.addMarker(new MarkerOptions().position(center23).title("Oncquest Laboratories Ltd., New Delhi").snippet("website: https://www.oncquest.net/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center23));

        //Test Center 24
        final LatLng center24 = new LatLng(28.909570, 77.319587);
        mMap.addMarker(new MarkerOptions().position(center24).title("MAX LAB -SARITA VIHAR, Sarita Vihar, New Delhi").snippet("website: http://maxlab.co.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center24));

        //Test Center 25
        final LatLng center25 = new LatLng(28.986479, 77.275642);
        mMap.addMarker(new MarkerOptions().position(center25).title("Mahajan Imaging, Defence Colony, New Delhi").snippet("website: http://www.mahajanimaging.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center25));

        //Test Center 26
        final LatLng center26 = new LatLng(29.024913, 77.231697);
        mMap.addMarker(new MarkerOptions().position(center26).title("CSIR-Institute of Genomics and Integrative Biology, Sukhdev Vihar, New Delhi").snippet("website: http://www.igib.res.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center26));

        //Test Center 27
        final LatLng center27 = new LatLng(28.928193, 77.121922);
        mMap.addMarker(new MarkerOptions().position(center27).title("Base Hospital Delhi Cantt, New Delhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center27));

        //Test Center 28
        final LatLng center28 = new LatLng(28.965313, 77.034036);
        mMap.addMarker(new MarkerOptions().position(center28).title("Noble Diagnostic Centre, Hari Nagar, New Delhi").snippet("website: http://www.noble-diagnostic.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center28));

        //Test Center 29
        final LatLng center29 = new LatLng(28.913985, 77.165780);
        mMap.addMarker(new MarkerOptions().position(center29).title("Star Imaging & Path Lab - Tilak Nagar, Tilak Nagar, New Delhi").snippet("website: http://www.starimaging.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center29));

        //Test Center 30
        final LatLng center30 = new LatLng(28.971670, 77.099862);
        mMap.addMarker(new MarkerOptions().position(center30).title("City X-Ray & Scan Clinic Pvt Ltd, Tilak Nagar, New Delhi").snippet("website: http://cityxrayclinic.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center30));

        //Test Center 31
        final LatLng center31 = new LatLng(28.678500, 77.297615);
        mMap.addMarker(new MarkerOptions().position(center31).title("Dr Bhimrao Ambedkar Multispeciality Hospital, Noida"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center31));

        //Test Center 32
        final LatLng center32 = new LatLng(28.890334, 77.385505);
        mMap.addMarker(new MarkerOptions().position(center32).title("Super Speciality Paediatric Hospital & Post Graduate Teaching Institute, Noida").snippet("website: http://www.ssphpgti.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center32));

        //Test Center 33
        final LatLng center33 = new LatLng(28.909570, 77.275642);
        mMap.addMarker(new MarkerOptions().position(center33).title("Dr. Ram Manohar Lohia Hospital, New Delhi").snippet("website: http://rmlh.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center33));

        //Test Center 34
        final LatLng center34 = new LatLng(28.986400, 77.294709);
        mMap.addMarker(new MarkerOptions().position(center34).title("Lady Hardinge Medical College, New Delhi").snippet("website: http://www.lhmc-hosp.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center34));

        //Test Center 35
        final LatLng center35 = new LatLng(28.970051, 77.253670);
        mMap.addMarker(new MarkerOptions().position(center35).title("Sir Ganga Ram Hospital Clinical Lab Services, Rajinder Nagar, New Delhi").snippet("website: https://sgrh.com/departments/pathology"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center35));

        //Test Center 36
        final LatLng center36 = new LatLng(28.912365, 77.121834);
        mMap.addMarker(new MarkerOptions().position(center36).title("Dept of Lab Services Dr. B.L. Kapur Memorial Hospital, Rajendra Place, New Delhi,").snippet("website: https://www.blkhospital.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center36));

        //Test Center 37
        final LatLng center37 = new LatLng(29.015452, 77.209727);
        mMap.addMarker(new MarkerOptions().position(center37).title("Employees' State Insurance Model Hospital, Bali Nagar, New Delhi").snippet("website: http://www.esihospital.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center37));

        //Test Center 38
        final LatLng center38 = new LatLng(29.063332, 77.121833);
        mMap.addMarker(new MarkerOptions().position(center38).title("Northern Railway Central Hospital, Paharganj, New Delhi, Delhi").snippet("website: https://nrchdelhi.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center38));

        //Test Center 39
        final LatLng center39 = new LatLng(28.731393, 77.099086);
        mMap.addMarker(new MarkerOptions().position(center39).title("Dept of Laboratory Services Action Cancer Hospital, Paschim Vihar, New Delhi").snippet("website: https://www.actioncancerhospital.com/#modal-one"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center39));

        //Test Center 40
        final LatLng center40 = new LatLng(29.195235, 77.099865);
        mMap.addMarker(new MarkerOptions().position(center40).title("CRL DIAGNOSTICS PVT LTD-Best Pathology Labs, Paschim Vihar, New Delhi").snippet("website: http://www.crldiagnostics.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center40));

        //Test Center 41
        final LatLng center41 = new LatLng(28.909570, 77.209724);
        mMap.addMarker(new MarkerOptions().position(center41).title("Maulana Azad Medical College(MAMC), Balmiki Basti, New Delhi").snippet("website: http://www.mamc.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center41));

        //Test Center 42
        final LatLng center42 = new LatLng(29.082536, 77.209724);
        mMap.addMarker(new MarkerOptions().position(center42).title("New Delhi Tuberculosis Centre, Raj Ghat, New Delhi").snippet("website: http://www.ndtbc.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center42));

        //Test Center 43
        final LatLng center43 = new LatLng(29.093676, 77.143814);
        mMap.addMarker(new MarkerOptions().position(center43).title("Gagan Pathology Centre, New Delhi,").snippet("website: http://www.gaganlab.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center43));

        //Test Center 44
        final LatLng center44 = new LatLng(28.993014, 77.429447);
        mMap.addMarker(new MarkerOptions().position(center44).title("National Institute of Biologicals, Noida").snippet("website: http://nib.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center44));

        //Test Center 45
        final LatLng center45 = new LatLng(28.659609, 77.437956);
        mMap.addMarker(new MarkerOptions().position(center45).title("Medical Testing Lab Yashoda Superspeciality Hospital").snippet("website: http://www.yashodahospital.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center45));

        //Test Center 46
        final LatLng center46 = new LatLng(28.983392, 77.121843);
        mMap.addMarker(new MarkerOptions().position(center46).title("Molecular diagnostics Laboratory, Rajiv Gandhi Cancer Institute & Research Centre, New Delhi").snippet("website: https://www.rgcirc.org/diagnostics/department-of-laboratory-and-transfusion-services/molecular-laboratory/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center46));

        //Test Center 47
        final LatLng center47 = new LatLng(29.157758, 77.297619);
        mMap.addMarker(new MarkerOptions().position(center47).title("National Centre for Disease Control, New Delhi").snippet("website: http://www.ncdc.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center47));

        //Test Center 48
        final LatLng center48 = new LatLng(29.030840, 77.275649);
        mMap.addMarker(new MarkerOptions().position(center48).title("Vallabhbhai Patel Chest Institute Delhi, New Delhi").snippet("website: http://www.vpci.org.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center48));

        //Test Center 49
        final LatLng center49 = new LatLng(29.071784, 77.275649);
        mMap.addMarker(new MarkerOptions().position(center49).title("Defense Institute Of Physiology & Allied Science, Timarpur, New Delhi").snippet("website: https://www.drdo.gov.in/labs-establishment/contact-us/defence-institute-physiology-allied-sciences-dipas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center49));

        //Test Center 50
        final LatLng center50 = new LatLng(29.166677, 77.055928);
        mMap.addMarker(new MarkerOptions().position(center50).title("Dr Lal PathLabs, National Reference laboratory, New Delhi").snippet("website: https://www.lalpathlabs.com/delhi-ncr/delhi/rohini-sec-18"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center50));

        //Test Center 51
        final LatLng center51 = new LatLng(28.990162, 77.363539);
        mMap.addMarker(new MarkerOptions().position(center51).title("University College Of Medical Sciences, New Delhi").snippet("website: http://ucms.ac.in/index.htm"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center51));

        //Test Center 52
        final LatLng center52 = new LatLng(29.145323, 77.209730);
        mMap.addMarker(new MarkerOptions().position(center52).title("Rajiv Gandhi Super Speciality Hospital, New Delhi").snippet("website: http://www.rajivgandhisuperspecialityhospital.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center52));

        //Test Center 53
        final LatLng center53 = new LatLng(28.823605, 77.169873);
        mMap.addMarker(new MarkerOptions().position(center53).title("Translational Health Science And Technology Institute, Faridabad").snippet("website: http://www.thsti.res.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center53));

        //Test Center 54
        final LatLng center54 = new LatLng(28.909570, 77.330192);
        mMap.addMarker(new MarkerOptions().position(center54).title("Department of Laboratory Medicine Jaypee Hospital, Noida").snippet("website: https://www.jaypeehealthcare.com/department/laboratory-medicine"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center54));

        //Test Center 55
        final LatLng center55 = new LatLng(28.816151, 77.011971);
        mMap.addMarker(new MarkerOptions().position(center55).title("Civil Hospital").snippet("website: http://haryanahealth.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center55));

        //Test Center 56
        final LatLng center56 = new LatLng(28.681301, 76.989998);
        mMap.addMarker(new MarkerOptions().position(center56).title("Modern Diagnostic & Research Centre Pvt Ltd").snippet("website: http://lab.mdrcindia.com/modern-diagnostic-research-center-pvt-ltd-modern-diagnostic-research-centre-diagnostic-centre-jawahar-nagar-gurgaon-86978/Home?utm_source=locator&utm_medium=googleplaces"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center56));

        //Test Center 57
        final LatLng center57 = new LatLng(28.798518, 77.077889);
        mMap.addMarker(new MarkerOptions().position(center57).title("Department of Pathology and Laboratory Medicine Medanta-The Medicity").snippet("website: https://www.medanta.org/gurugram/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center57));

        //Test Center 58
        final LatLng center58 = new LatLng(28.832603, 77.385505);
        mMap.addMarker(new MarkerOptions().position(center58).title("ESIC Medical College and Hospital").snippet("website: http://www.esic.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center58));

        //Test Center 59
        final LatLng center59 = new LatLng(29.074869, 77.451426);
        mMap.addMarker(new MarkerOptions().position(center59).title("MMG District Hospital").snippet("website: https://www.nhp.gov.in/hospital/(mmg-hospital)-district-hospital-ghaziabad-uttar_pradesh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center59));

        //Test Center 60
        final LatLng center60 = new LatLng(28.798518, 77.099862);
        mMap.addMarker(new MarkerOptions().position(center60).title("Strand Life Sciences").snippet("website: http://www.strandls.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center60));

        //Test Center 61
        final LatLng center61 = new LatLng(28.835835, 77.440045);
        mMap.addMarker(new MarkerOptions().position(center60).title("Central Lab Sharda Hospital, Greater Noida").snippet("website: https://www.shardahospital.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center60));

        //Test Center 62
        final LatLng center62 = new LatLng(28.807101, 77.505976);
        mMap.addMarker(new MarkerOptions().position(center62).title("Government Institute of Medical Sciences, Greater Noida").snippet("website: http://www.gims.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center62));

        //Test Center 63
        final LatLng center63 = new LatLng(29.228807, 76.637284);
        mMap.addMarker(new MarkerOptions().position(center63).title("Pandit Bhagwat Dayal Sharma Post Graduate Institute of Medical Sciences").snippet("website: http://www.pgimsrohtak.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center63));

        //Test Center 64
        final LatLng center64 = new LatLng(29.338311, 76.853654);
        mMap.addMarker(new MarkerOptions().position(center64).title("Bhagat Phool Singh Government Medical College").snippet("website: http://www.bpsgmckhanpur.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center64));

        //Test Center 65
        final LatLng center65 = new LatLng(28.484116, 76.950117);
        mMap.addMarker(new MarkerOptions().position(center65).title("SHKM Government Medical College").snippet("website: http://www.gmcmewat.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center65));

        //Test Center 66
        final LatLng center66 = new LatLng(29.360796, 77.785175);
        mMap.addMarker(new MarkerOptions().position(center66).title("Lala Lajpat Rai Memorial Medical College").snippet("website: http://llrmmedicalcollege.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center66));

        //Test Center 67
        final LatLng center67 = new LatLng(28.824926, 77.894981);
        mMap.addMarker(new MarkerOptions().position(center67).title("Babu Banarasi Das Government District Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center67));

      //  mMap.animateCamera(CameraUpdateFactory.zoomTo(6));



        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getPosition().equals(center1)) {
                    Uri uriUrl = Uri.parse("https://www.ilbs.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center2)) {
                    Uri uriUrl = Uri.parse("http://www.nitrd.nic.in/Content/Viewdata.aspx?value=29");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center3)) {
                    Uri uriUrl = Uri.parse("http://www.prlworld.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }

                else if(marker.getPosition().equals(center4)) {
                    Uri uriUrl = Uri.parse("http://www.genestrings.co.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center5)) {
                    Uri uriUrl = Uri.parse("https://www.venkateshwarhospitals.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center6)) {
                    Uri uriUrl = Uri.parse("https://www.srlworld.com/?utm_source=gbgurgaonsrludyogvihar&utm_medium=product&utm_campaign=offer");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center8)) {
                    Uri uriUrl = Uri.parse("https://www.pathkindlabs.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center10)) {
                    Uri uriUrl = Uri.parse("https://corediagnostics.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center11)) {
                    Uri uriUrl = Uri.parse("https://www.manipalhospitals.com/delhi/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center12)) {
                    Uri uriUrl = Uri.parse("http://www.genxdiagnostics.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center13)) {
                    Uri uriUrl = Uri.parse("https://www.metropolisindia.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center14)) {
                    Uri uriUrl = Uri.parse("https://aakashhealthcare.com/lab-medicine");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center15)) {
                    Uri uriUrl = Uri.parse("https://www.drdangslab.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center16)) {
                    Uri uriUrl = Uri.parse("http://www.sterlingaccuris.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center17)) {
                    Uri uriUrl = Uri.parse("https://www.lifelinelaboratory.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center20)) {
                    Uri uriUrl = Uri.parse("https://delhi.apollohospitals.com/laboratory-services");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center21)) {
                    Uri uriUrl = Uri.parse("https://www.aiims.edu/en.html");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center23)) {
                    Uri uriUrl = Uri.parse("https://www.oncquest.net/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center24)) {
                    Uri uriUrl = Uri.parse("http://maxlab.co.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center25)) {
                    Uri uriUrl = Uri.parse("http://www.mahajanimaging.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center26)) {
                    Uri uriUrl = Uri.parse("http://www.igib.res.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center28)) {
                    Uri uriUrl = Uri.parse("http://www.noble-diagnostic.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center19)) {
                    Uri uriUrl = Uri.parse("http://www.starimaging.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center30)) {
                    Uri uriUrl = Uri.parse("http://cityxrayclinic.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center32)) {
                    Uri uriUrl = Uri.parse("http://www.ssphpgti.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center33)) {
                    Uri uriUrl = Uri.parse("http://rmlh.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center34)) {
                    Uri uriUrl = Uri.parse("http://www.lhmc-hosp.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center35)) {
                    Uri uriUrl = Uri.parse("https://sgrh.com/departments/pathology");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center36)) {
                    Uri uriUrl = Uri.parse("https://www.blkhospital.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center37)) {
                    Uri uriUrl = Uri.parse("http://www.esihospital.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center38)) {
                    Uri uriUrl = Uri.parse("https://nrchdelhi.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center39)) {
                    Uri uriUrl = Uri.parse("https://www.actioncancerhospital.com/#modal-one");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center40)) {
                    Uri uriUrl = Uri.parse("http://www.crldiagnostics.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center41)) {
                    Uri uriUrl = Uri.parse("http://www.mamc.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center42)) {
                    Uri uriUrl = Uri.parse("http://www.ndtbc.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center43)) {
                    Uri uriUrl = Uri.parse("http://www.gaganlab.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center44)) {
                    Uri uriUrl = Uri.parse("http://nib.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center47)) {
                    Uri uriUrl = Uri.parse("http://www.yashodahospital.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center48)) {
                    Uri uriUrl = Uri.parse("https://www.rgcirc.org/diagnostics/department-of-laboratory-and-transfusion-services/molecular-laboratory/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center47)) {
                    Uri uriUrl = Uri.parse("http://www.ncdc.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center48)) {
                    Uri uriUrl = Uri.parse("http://www.vpci.org.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center49)) {
                    Uri uriUrl = Uri.parse("https://www.drdo.gov.in/labs-establishment/contact-us/defence-institute-physiology-allied-sciences-dipas");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center50)) {
                    Uri uriUrl = Uri.parse("https://www.lalpathlabs.com/delhi-ncr/delhi/rohini-sec-18");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center51)) {
                    Uri uriUrl = Uri.parse("http://ucms.ac.in/index.htm");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center52)) {
                    Uri uriUrl = Uri.parse("http://www.rajivgandhisuperspecialityhospital.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center53)) {
                    Uri uriUrl = Uri.parse("http://www.thsti.res.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center54)) {
                    Uri uriUrl = Uri.parse("https://www.jaypeehealthcare.com/department/laboratory-medicine");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center55)) {
                    Uri uriUrl = Uri.parse("http://haryanahealth.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center56)) {
                    Uri uriUrl = Uri.parse("http://lab.mdrcindia.com/modern-diagnostic-research-center-pvt-ltd-modern-diagnostic-research-centre-diagnostic-centre-jawahar-nagar-gurgaon-86978/Home?utm_source=locator&utm_medium=googleplaces");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center57)) {
                    Uri uriUrl = Uri.parse("https://www.medanta.org/gurugram/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center58)) {
                    Uri uriUrl = Uri.parse("http://www.esic.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center59)) {
                    Uri uriUrl = Uri.parse("https://www.nhp.gov.in/hospital/(mmg-hospital)-district-hospital-ghaziabad-uttar_pradesh");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center60)) {
                    Uri uriUrl = Uri.parse("http://www.strandls.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center61)) {
                    Uri uriUrl = Uri.parse("https://www.shardahospital.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center62)) {
                    Uri uriUrl = Uri.parse("http://www.gims.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center63)) {
                    Uri uriUrl = Uri.parse("http://www.pgimsrohtak.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center64)) {
                    Uri uriUrl = Uri.parse("http://www.bpsgmckhanpur.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center65)) {
                    Uri uriUrl = Uri.parse("http://www.gmcmewat.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center66)) {
                    Uri uriUrl = Uri.parse("http://llrmmedicalcollege.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }


            }
        });
    }
    LocationCallback mLocationCallback=new LocationCallback(){
        @Override
        public void onLocationResult(LocationResult locationResult) {
            for(Location location1 : locationResult.getLocations()) {
                if (getApplicationContext() != null) {
                    mLastLocation = location1;
                    latLng = new LatLng(location1.getLatitude(), location1.getLongitude());
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
                }
            }

        }
    };
    public void onBackPressed(){
        stopService(new Intent(getApplicationContext(), Location_Services.class));
        Intent intent = new Intent(Test_MapsActivity.this, home.class);
        startActivity(intent);
        finish();
        return;

    };
}
