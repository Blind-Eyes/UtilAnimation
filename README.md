this is the class i'm using on my other application need animation,
this is java class only
no xml required,
easy to use,
less code,
reusable
[demo](https://youtu.be/q-sNtln96rI)

#####how to use?

just download this [class](https://raw.githubusercontent.com/francojohnc/UtilAnimation/master/app/src/main/java/apkmarvel/com/utilanimation/util/UtilAnim.java) and copy to your application

#####syntax
```
  UtilAnim.rotate(v, 360, 1000, null);
```
   v - is your object you want to animate
   360 - degrees
   null - is the animation listener

Fragment Animation
```
 public class RotateFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);
        UtilAnim.rotate(v, 360, 1000, null);
        return v;
    }
}
``` 
Image Animation
```
  UtilAnim.rotate(imgProgdev, 360, 1000, null);
``` 
On Animation listener
```
  UtilAnim.rotateY(v, 360, 3000, new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                Toast.makeText(MainActivity.this, "onAnimationStart", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAnimationEnd(Animator animator) {
                Toast.makeText(MainActivity.this, "onAnimationEnd", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAnimationCancel(Animator animator) {

            }
            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
 ```
