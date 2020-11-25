import React from "react";
import {Formik} from "formik";
import * as Yup from "yup";

const IdValidation = () => (
    <Formik
        initialValues={{id: ""}}
        onSubmit={(values, {setSubmitting}) => {
            setTimeout(() => {
                //LoginActions.login(values);
                console.log("Ámen");
                setSubmitting(false);
            }, 500);
        }}

        validationSchema={Yup.object().shape({
            id: Yup.number()
                .integer()
                .nullable(false)
                .required("Id megadása kötelező"),

        })}
    >
        {props => {
            const {
                values,
                touched,
                errors,
                isSubmitting,
                handleChange,
                handleBlur,
                handleSubmit
            } = props;
            return (
                <form onSubmit={handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="id">Watch ID</label>
                        <input
                            name="id"
                            type="text"
                            placeholder="Add meg az id-t"
                            value={values.id}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={ errors.id && touched.id ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.id && touched.id && (
                            <div className={"invalid-feedback"}>{errors.id} </div>
                        )}
                    </div>

                    <button type="submit" disabled={isSubmitting} className={"btn btn-primary"}>
                        Keres
                    </button>
                </form>
            );
        }}
    </Formik>
);
export default IdValidation;